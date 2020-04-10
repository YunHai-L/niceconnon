package cn.rockets.view;




import cn.rockets.model.NUser;

import javax.swing.*;
import java.awt.*;


/**
 * 组件显示层
 * @author 张叔叔
 * @version 1.0
 * @copyright
 */
public class ModuleShowView extends JPanel {
    private NUser user1 = null;                                                         //用户1
    private NUser user2 = null;                                                         //用户2
    private Font nameFont = new Font("微软雅黑", Font.BOLD, 27);            //名称使用字体
    private JProgressBar user1Blood = new JProgressBar();                               //用户1血条
    private JProgressBar user2Blood = new JProgressBar();                               //用户2血条
    private JProgressBar user1Power = new JProgressBar();                               //用户1能量条
    private JProgressBar user2Power = new JProgressBar();                               //用户1能量条
    private JProgressBar strengths = new JProgressBar();                                //用户蓄力条
    private Font progressFont = new Font("微软雅黑", Font.BOLD, 20);           //进度条使用字体
    private JLabel lblUserSkill1 = new JLabel();                                        //用户技能栏
    private JLabel lblUserSkill2 = new JLabel();
    private JLabel lblTimes = new JLabel("9 秒");                                     //剩余时间
    private JLabel lblBouts = new JLabel("回合数： 5");                                //剩余回合数
    private Font txtFont = new Font("微软雅黑", Font.BOLD, 40);                 //时间/回合数字体

    public ModuleShowView(NUser user1, NUser user2) {
        this.user1 = user1;
        this.user2 = user2;

        setLayout(null);
        setBounds(0,0,1442,847);
        setOpaque(false);

        init();
    }

    /**
     * 初始化
     */
    private void init() {
        //头像
        JLabel lblUser1 = new JLabel(new ImageIcon(user1.getHandImagePath()));
        lblUser1.setBounds(0,0,lblUser1.getIcon().getIconWidth(), lblUser1.getIcon().getIconHeight());
        JLabel lblUser2 = new JLabel(new ImageIcon(user2.getHandImagePath()));
        lblUser2.setBounds(1442 - lblUser2.getIcon().getIconWidth(),0,
                lblUser2.getIcon().getIconWidth(), lblUser2.getIcon().getIconHeight());


        //名称
        JLabel lblText1 = new JLabel(user1.getName());
        lblText1.setBounds(lblUser1.getIcon().getIconWidth() + 10, 20, 200, 40);
        JLabel lblText2 = new JLabel(user2.getName());
        lblText2.setBounds(lblUser2.getX() - 200, 20, 200, 40);
        lblText2.setHorizontalAlignment(SwingConstants.RIGHT);

        //设置文本样式
        lblText1.setFont(nameFont);
        lblText1.setForeground(Color.white);
        lblText2.setFont(nameFont);
        lblText2.setForeground(Color.white);

        //血条
        user1Blood.setBounds(0,lblUser1.getIcon().getIconHeight() + 20, 180, 20);
        initProgress(user1Blood, Color.red);

        user2Blood.setBounds(1442 - user1Blood.getWidth() - 20, lblUser2.getIcon().getIconHeight() + 20, 180,20);
        initProgress(user2Blood, Color.red);


        //能量条
        user1Power.setBounds(0,user1Blood.getY() + user1Blood.getHeight() + 10, 180, 20);
        initProgress(user1Power, Color.GREEN);

        user2Power.setBounds(user2Blood.getX(), user2Blood.getY() + user2Blood.getHeight() + 10, 180, 20);
        initProgress(user2Power, Color.GREEN);

        //蓄力条
        strengths.setBounds(0,847 - 40, 1000, 40);
        strengths.setStringPainted(true);
        strengths.setValue(50);
        strengths.setMinimum(0);
        strengths.setMaximum(100);
        strengths.setForeground(Color.RED);
        Color color = new Color(157,165,232);
        strengths.setBackground(color);
        strengths.setString("蓄力(" + strengths.getValue() + "/" + strengths.getMaximum() + ")");
        strengths.setFont(progressFont);

        //用户技能栏
        lblUserSkill1.setIcon(new ImageIcon(".\\resources\\images\\技能2_连发攻击.png"));
        lblUserSkill1.setBounds(strengths.getWidth() + 70,strengths.getY()
                , lblUserSkill1.getIcon().getIconWidth(), lblUserSkill1.getIcon().getIconHeight());


        lblUserSkill2.setIcon(new ImageIcon(".\\resources\\images\\技能1_多发攻击.png"));
        lblUserSkill2.setBounds(lblUserSkill1.getX() + lblUserSkill1.getIcon().getIconWidth() + 30, strengths.getY(),
                lblUserSkill2.getIcon().getIconWidth(), lblUserSkill2.getIcon().getIconHeight());


        //顶部时间/回合数
        lblTimes.setBounds(500, 20, 100, 60);
        lblTimes.setFont(txtFont);

        lblBouts.setBounds(lblTimes.getX() + lblTimes.getWidth() + 100, 20, 200, 60);
        lblBouts.setFont(txtFont);


        //放到面板上
        add(lblUser1);
        add(lblUser2);
        add(lblText1);
        add(lblText2);
        add(user1Blood);
        add(user2Blood);
        add(user1Power);
        add(user2Power);
        add(strengths);
        add(lblUserSkill1);
        add(lblUserSkill2);
        add(lblTimes);
        add(lblBouts);
    }

    /**
     * 封装一下初始化进度条
     * @param progressBar
     * @param color
     */
    private void initProgress(JProgressBar progressBar, Color color){
        progressBar.setStringPainted(true);
        progressBar.setValue(50);
        progressBar.setMinimum(0);
        progressBar.setMaximum(100);
        progressBar.setForeground(color);
        progressBar.setString(progressBar.getValue() + "/" + progressBar.getMaximum());
        progressBar.setFont(progressFont);
    }
}
