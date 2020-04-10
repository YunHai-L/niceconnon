package cn.rockets.view;


import cn.rockets.model.NUser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Auther: YunHai
 * @Date: 2020/4/5 15:36
 * @Description:
 */
public class BattleView2 extends JPanel {
    public BattleView2(JFrame jf, JPanel pMain, CardLayout card){
        add(new JLabel("战斗界面"));
        JButton jbRoom = new JButton("切换到房间页面");
        add(jbRoom);
        jbRoom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(pMain, "room");
                jf.setSize(1442, 847);
                jf.setLocationRelativeTo(null);
            }
        });


        BackGroundView backGroundView = new BackGroundView();

        NUser user1 = new NUser();
        user1.setHandImagePath(".\\resources\\images\\头像 男孩.png");
        user1.setName("和尚洗头用飘柔");
        NUser user2 = new NUser();
        user2.setHandImagePath(".\\resources\\images\\头像_女孩.png");
        user2.setName("和尚不洗头");
        ModuleShowView moduleShowView = new ModuleShowView(user1, user2);

        RoleShowView roleShowView = new RoleShowView(user1,user2);

        StackPaneDemo stackPaneDemo = new StackPaneDemo(backGroundView,moduleShowView,roleShowView);

        add(stackPaneDemo);

    }


}
