package cn.rockets.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Auther: YunHai
 * @Date: 2020/4/5 15:34
 * @Description:
 */
public class HallView extends JPanel {
    public HallView(JFrame jf, JPanel pMain, CardLayout card){



        add(new JLabel("大厅界面"));
        JButton jbLogin = new JButton("切换到登录页面");
        add(jbLogin);
        jbLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(pMain, "login");
                jf.setSize(600,600);
            }
        });
        JButton jbPlayer = new JButton("切换到玩家信息页面");
        add(jbPlayer);
        jbPlayer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(pMain, "player");
                jf.setSize(600,600);
            }
        });

        JButton jbRoom = new JButton("切换到房间信息页面");
        add(jbRoom);
        jbRoom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(pMain, "room");
                jf.setSize(600,600);
            }
        });

        JButton jbVegetable = new JButton("切换到新手教程页面");
        add(jbVegetable);
        jbVegetable.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(pMain, "vegetable");
                jf.setSize(600,600);
            }
        });


    }
}
