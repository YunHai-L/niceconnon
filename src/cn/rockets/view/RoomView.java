package cn.rockets.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Auther: YunHai
 * @Date: 2020/4/5 15:35
 * @Description:
 */
public class RoomView extends JPanel {
    public RoomView(JFrame jf, JPanel pMain, CardLayout card){
        add(new JLabel("房间界面"));
        JButton jbHall = new JButton("切换到大厅页面");
        add(jbHall);
        jbHall.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(pMain, "hall");
                jf.setSize(400,400);
            }
        });

        JButton jbBattle = new JButton("切换到战斗页面");
        add(jbBattle);
        jbBattle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(pMain, "battle");
                jf.setSize(500,500);
            }
        });
    }
}
