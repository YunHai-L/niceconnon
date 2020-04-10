package cn.rockets.view;

import cn.rockets.utils.ImageUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettlementView extends JPanel {
    private JFrame jf;
    private CardLayout card;
    private JPanel pMain;
    private ImageIcon backImage = null;
    private JPanel contentPane = null;
    private JButton btnBack = new JButton();//返回大厅的按钮
    private JTextArea jTextArea = null;
    private JTextArea jTextArea2 = null;
    String winnerName="胜利者";
    String loserName="失败者";
    String winGame="";

    public SettlementView(JFrame jf, JPanel pMain, CardLayout card) {
        this.jf = jf;
        this.card = card;
        this.pMain = pMain;
//        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
//        jf.setUndecorated(true);
        backImage = ImageUtil.GetImage(".\\resource\\结算背景.jpg");
        contentPane = (JPanel) jf.getContentPane();
        initComponent();
        initEvents();
        setSize(1442, 847);
        jf.setLocationRelativeTo(null);//窗口位于屏幕中央
        System.out.print(backImage.getIconWidth());
        System.out.println(backImage.getIconHeight());
    }

    private void initEvents() {
        btnBack.addActionListener(e -> {
            jf.dispose();
                }
        );
    }

    private void initComponent() {
        contentPane.setLayout(null);
        setBackground(".\\resource\\结算背景.jpg");
        btnBack.setIcon(ImageUtil.GetImage(".\\resource\\返回大厅.png"));
        btnBack.setRolloverIcon(ImageUtil.GetImage(".\\resource\\返回大厅.png"));
        btnBack.setBorder(null);
        btnBack.setBounds(1181,661,193,83);
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(pMain, "hall");
            }
        });
        contentPane.add(btnBack);


        winGame=winnerName+"战胜了"+loserName;
        jTextArea = new JTextArea();
        jTextArea.setLineWrap(true);
        jTextArea.setWrapStyleWord(true);
        jTextArea.append("         "+winGame+"\n"
                +"觉得本游戏好玩给个好评噢亲~~");
        jTextArea.setBounds(394,110,756,240);
        jTextArea.setFont(new Font("微软雅黑", Font.BOLD, 35));
        jTextArea.setOpaque(false);
        jTextArea.setEditable(false);


        contentPane.add(jTextArea);
    }

    private void setBackground(String imagePath) {
        backImage = ImageUtil.GetImage(imagePath);
        JLabel lblBack = new JLabel(backImage);
        lblBack.setBounds(0, 0, backImage.getIconWidth(), backImage.getIconHeight());
        add(lblBack, new Integer(Integer.MIN_VALUE));
        contentPane.setOpaque(false);
    }


}





