package cn.rockets.view;

import cn.rockets.utils.ImageUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: YunHai
 * @Date: 2020/4/5 15:36
 * @Description:
 */
public class VegetableView1 extends JPanel {
    //背景图片
    private ImageIcon backImage = new ImageIcon();
    //关闭按钮
    private JButton btnClose = new JButton();
    //进入游戏按钮
    private JButton btnEnter = new JButton();
    //教程说明文本域
    private JTextArea jTextArea = new JTextArea();
    //放置背景图片的标签
    private JLabel lblBack = new JLabel();

    public VegetableView1(JFrame jf, JPanel pMain, CardLayout card){
//        add(new JLabel("萌新教程界面"));
//        JButton jbHall = new JButton("切换到大厅页面");
//        add(jbHall);
        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(pMain, "hall");
                jf.setSize(500,600);
            }
        });
        setBackground(".\\resource\\操作说明背景.png");
        initComponents();
    }

    /**
     *初始化控件
     */
    private void initComponents() {
        btnClose.setIcon(ImageUtil.GetImage(".\\resource\\关闭按钮_1.png"));
        btnClose.setRolloverIcon(ImageUtil.GetImage(".\\resource\\关闭按钮_1.png"));
        //去掉btnClose的边框
        btnClose.setBorder(null);
        btnClose.setBounds(1140,40,50,50);

        btnEnter.setIcon(ImageUtil.GetImage(".\\resource\\进入游戏.png"));
        btnEnter.setRolloverIcon(ImageUtil.GetImage(".\\resource\\进入游戏.png"));
        btnEnter.setBorder(null);
        btnEnter.setBounds(930,580,200,50);

        jTextArea = new JTextArea(9,10);
        jTextArea.setLineWrap(true);
        jTextArea.setWrapStyleWord(true);
        jTextArea.append("           游戏基本操作通过键盘方向键“上、下、左、右”以及\n" +
                "“空格”键实现。\n" +
                "         “左、右”：控制人物在地图上向左向右移动。\n" +
                "         “上、下”：控制人物发射炮弹的角度。\n" +
                "         “空格”：控制炮弹发射的力度，按住空格的时间越久，\n" +
                "  炮弹发射的距离越远。在最下面的“力度”刻度条，会显示\n" +
                "  当前空格操作所产生的力度。当不小心按过了应有刻度时应\n" +
                "  持续按下直到100时会向回反刻度，此时按的时间越久炮弹发\n" +
                "  射越近。");
        jTextArea.setBounds(120,170,1000,417);
        jTextArea.setFont(new Font("微软雅黑", Font.BOLD, 35));
        //设置文本域为透明
        jTextArea.setOpaque(false);
        //设置文本域内容不可编辑
        jTextArea.setEditable(false);
//        jTextArea.setBorder(null);
        
        lblBack.add(jTextArea);
        lblBack.add(btnClose);
        lblBack.add(btnEnter);
    }

    /**
     * 设置背景图片
     * @param imagePath
     */
    public void setBackground(String imagePath){
        backImage = ImageUtil.GetImage(imagePath);
        lblBack = new JLabel(backImage);
        lblBack.setBounds(0,0,backImage.getIconWidth(),backImage.getIconHeight());
        add(lblBack);
    }
}

