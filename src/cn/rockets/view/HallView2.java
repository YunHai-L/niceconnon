package cn.rockets.view;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @Auther: YunHai
 * @Date: 2020/4/5 15:34
 * @Description:
 */
public class HallView2 extends JPanel {
    JPanel bgJpanel = new JPanel();    //背景图片面板
    JPanel headJpanel = new JPanel();  //头像区域面板
    JPanel chatJpanel = new JPanel();  //聊天区域面板
    JPanel roomJpanel = new JPanel();  //房间区域面板
    JPanel loginJpanel = new JPanel(); //登陆按钮面板
    JLabel jbRoom = new JLabel(new ImageIcon(".\\resource\\进入.png"));
    JLabel jbLogin = new JLabel(new ImageIcon(".\\resource\\关闭按钮_1.png"));
    public HallView2(JFrame jf, JPanel pMain, CardLayout card){
        //add(new JLabel("大厅界面"));
        setLayout(null);
        addbgJpanel();
        addHeadJpanel();
        addChatJpanel();
        addRoomJpanel();
        addLoginJpanel();

        /**
         * 切换到登陆界面事件
         */
        jbLogin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                card.show(pMain, "login");
                jf.setSize(600,600);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                jbLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
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


        /**
         * 进入到房间内部事件
         */
        jbRoom.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                card.show(pMain, "room");
                jf.setSize(600,600);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
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

    /**
     * 登陆按钮面板
     */
    private void addLoginJpanel() {
        loginJpanel.setLayout(null);
        loginJpanel.setBackground(new Color(0,0,0,0));
        loginJpanel.setBounds(1300,25,100,100);
        jbLogin.setBounds(10,10,65,65);
        loginJpanel.add(jbLogin);

    }

    /**
     * 房间面板
     */
    private void addRoomJpanel() {
        roomJpanel.setLayout(null);
        JLabel jLabel =  new JLabel(new ImageIcon(".\\resource\\nicecannon/房间列表.png"));
        jLabel.setBounds(0,0,570,700);
        //房间列表面板
        JPanel listJpanel = new JPanel();
        listJpanel.setLayout(null);
        listJpanel.setBounds(186,68,280,500);
        listJpanel.setBackground(new Color(0,0,0,0));
        //房间按钮
        JButton[] jButtons = new JButton[5];
        for(int i =0 ; i < 5;i++){
            jButtons[i] = new JButton(new ImageIcon(".\\resource\\房间"+(i+1)+".png"));
            jButtons[i].setBounds(0,100*i,277,100);
            //jButtons[i].setBorder(null);
//            jButtons[i].addMouseListener(new MouseAdapter() {
//                @Override
//                public void mouseClicked(MouseEvent e) {
//                    //jButtons[i].setBorder();
//                }
//
//                @Override
//                public void mouseEntered(MouseEvent e) {
//                    super.mouseEntered(e);
//                }
//
//                @Override
//                public void mouseExited(MouseEvent e) {
//                    super.mouseExited(e);
//                }
//            });
            listJpanel.add(jButtons[i]);
        }
        roomJpanel.setBounds(870,150,570,700);
        jbRoom.setBounds(376,580,138,60);
        roomJpanel.add(jbRoom);
        roomJpanel.add(listJpanel);
        roomJpanel.add(jLabel);

    }

    /**
     * 设置聊天面板
     *
     */
    private void addChatJpanel() {
        chatJpanel.setLayout(null);
        chatJpanel.setBounds(0,335,700,470);
        chatJpanel.setBackground(new Color(0,0,0,0));
        JLabel jLabel = new JLabel(new ImageIcon(".\\resource\\聊天框.png"));
        JLabel inputlbl = new JLabel(new ImageIcon(".\\resource\\信息输入框.png"));
        JLabel sendlbl = new JLabel(new ImageIcon(".\\resource\\发送.png"));
        jLabel.setBounds(0,50,700,300);
        inputlbl.setBounds(200,400,250,45);
        sendlbl.setBounds(480,395,125,50);
        chatJpanel.add(jLabel);
        chatJpanel.add(inputlbl);
        chatJpanel.add(sendlbl);
    }
    /**
     * 设置头像面板
     */
    private void addHeadJpanel() {
        headJpanel.setLayout(null);
        JLabel imagelbl = new JLabel(new ImageIcon(".\\resource\\头像 男孩.png"));
        JLabel Namelbl = new JLabel("和尚洗头用飘然");
        headJpanel.setBounds(20,20,350,300);
        headJpanel.setBackground(new Color(0,0,0,0));
        imagelbl.setBounds(70,20,150  ,150);
        Namelbl.setBounds(230,50,120,120);
        headJpanel.add(imagelbl);
        headJpanel.add(Namelbl);
    }

    /**
     * 设置背景面板
     */
    private void addbgJpanel() {
        bgJpanel.setLayout(null);
        ImageIcon imageIcon = new ImageIcon(".\\resource\\选择房间背景.jpg");
        JLabel label = new JLabel(imageIcon);
        label.setBounds(0,0,imageIcon.getIconWidth(),imageIcon.getIconHeight());
        bgJpanel.setBounds(0,0,imageIcon.getIconWidth(),imageIcon.getIconHeight());

        bgJpanel.add(headJpanel);
        bgJpanel.add(roomJpanel);
        bgJpanel.add(chatJpanel);
        bgJpanel.add(loginJpanel);
        bgJpanel.add(label);

        add(bgJpanel);
    }
}
