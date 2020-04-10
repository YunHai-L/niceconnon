package cn.rockets.view;

import javax.swing.*;
import java.awt.*;

/**
 * @Auther: YunHai
 * @Date: 2020/4/5 14:22
 * @Description:
 */
public class Start {

    JFrame jf;
    CardLayout card;
    JPanel pMain;

    public static void main(String[] args) {
        new Start();
    }


    Start(){
        jf = new JFrame();
        card = new CardLayout();
        pMain = new JPanel(card);
        jf.add(pMain);
        pMain.setBounds(500,400,200,200);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        pMain.add(new LoginView(jf,pMain,card),"login");
        pMain.add(new RegisterView(jf,pMain,card),"register");
        pMain.add(new HallView2(jf,pMain,card),"hall");
        pMain.add(new RoomView(jf,pMain,card),"room");
        pMain.add(new BattleView2(jf,pMain,card),"battle");
        pMain.add(new VegetableView1(jf,pMain,card),"vegetable");
        pMain.add(new SettlementView(jf, pMain, card), "settlement");
        card.show(pMain,"login");
        jf.setBounds(500,400,200,200);
        jf.setVisible(true);
    }












}
