package cn.rockets.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Auther: YunHai
 * @Date: 2020/4/5 15:36
 * @Description:
 */
public class BattleView extends JPanel {
    public BattleView(JFrame jf, JPanel pMain, CardLayout card){
        add(new JLabel("战斗界面"));
        JButton jbRoom = new JButton("切换到房间页面");
        add(jbRoom);
        jbRoom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(pMain, "room");
                jf.setSize(500,600);
            }
        });
    }
}
