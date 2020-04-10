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
public class PlayerView extends JPanel {
    public PlayerView(JFrame jf, JPanel pMain, CardLayout card){
        add(new JLabel("个人信息界面"));
        JButton jbHall = new JButton("切换到大厅页面");
        add(jbHall);
        jbHall.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(pMain, "hall");
                jf.setSize(500,600);
            }
        });
    }
}
