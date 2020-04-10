package cn.rockets.view;

import cn.rockets.model.NUser;

import javax.swing.*;
import java.awt.*;

/**
 * 角色显示层
 * @author 张叔叔
 * @version 1.0
 * @copyright
 */
public class RoleShowView extends JPanel {
    private NUser user1 = null;
    private NUser user2 = null;
    private JLabel lblBarrier = new JLabel();                   //障碍物
    private JPanel pnlProduceGoods = new JPanel(null);    //生成道具面板

    public RoleShowView(NUser user1, NUser user2) {
        this.user1 = user1;
        this.user2 = user2;
        setLayout(null);
        setBounds(0,0,1442,847);
        setOpaque(false);
        init();
    }

    /**
     * 初始化控件
     */
    private void init() {
        lblBarrier.setIcon(new ImageIcon(".\\resources\\images\\障碍物4.png"));
        //蓄力条的y为807
        lblBarrier.setBounds(300, 807 - lblBarrier.getIcon().getIconHeight(),
                lblBarrier.getIcon().getIconWidth(), lblBarrier.getIcon().getIconHeight());

        //初始化生成道具面板
        initPnlProduceGoods();

        initRole();

        add(lblBarrier);
        add(pnlProduceGoods);
    }

    /**
     * 初始化生成道具面板
     */
    private void initPnlProduceGoods() {
        pnlProduceGoods.setBounds(10,180,1442 - 20,150);
        pnlProduceGoods.setBorder(BorderFactory.createLineBorder(Color.black));

        JLabel lblText = new JLabel("道具生成区域");
        lblText.setBounds(pnlProduceGoods.getWidth() / 2 + 10,pnlProduceGoods.getHeight() / 2 - 20
                ,150,40);
        lblText.setFont(new Font("微软雅黑", Font.BOLD, 20));





        pnlProduceGoods.add(lblText);
    }

    /**
     * 初始化角色 - 测试使用
     */
    private void initRole() {
        JLabel lblUser1 = new JLabel(new ImageIcon(".\\resources\\images\\角色1.gif"));
        lblUser1.setBounds(800, 430, lblUser1.getIcon().getIconWidth(), lblUser1.getIcon().getIconHeight());


        JLabel lblUser2 = new JLabel(new ImageIcon(".\\resources\\images\\角色2.gif"));
        lblUser2.setBounds(400, 460, lblUser2.getIcon().getIconWidth(), lblUser2.getIcon().getIconHeight());

        add(lblUser1);
        add(lblUser2);
    }
}
