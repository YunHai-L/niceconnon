package cn.rockets.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Auther: YunHai
 * @Date: 2020/4/5 15:33
 * @Description:
 */
public class RegisterView extends JPanel {
    public RegisterView(JFrame jf, JPanel pMain, CardLayout card){
        add(new JLabel("注册界面"));
        JButton jbLogin = new JButton("切换到登录页面");
        add(jbLogin);
        jbLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(pMain, "login");
                jf.setSize(500,500);
            }
        });




    }
}
