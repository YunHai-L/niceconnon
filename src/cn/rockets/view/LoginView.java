package cn.rockets.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Auther: YunHai
 * @Date: 2020/4/5 15:32
 * @Description:
 */
public class LoginView extends JPanel {
    public LoginView(JFrame jf, JPanel pMain, CardLayout card){
        add(new JLabel("登录界面"));
        JButton jbRegister = new JButton("切换到注册页面");
        JButton jbHall = new JButton("切换到大厅页面");
        add(jbRegister); add(jbHall);
        jbRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(pMain, "register");
                jf.setSize(700,700);
            }
        });

        jbHall.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(pMain, "hall");
            }
        });
    }
}
