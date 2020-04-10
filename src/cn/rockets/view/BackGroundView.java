package cn.rockets.view;

import javax.swing.*;

/**
 * 背景层
 * @author 张叔叔
 * @version 1.0
 * @copyright
 */
public class BackGroundView extends JPanel {
    private ImageIcon imageIcon = null;         //背景图片
    private JLabel label = null;                //图片控件

    public BackGroundView() {
        setLayout(null);
        setBounds(0,0,1442,847);
        setOpaque(false);
        init();
    }

    /**
     * 初始化
     */
    private void init() {
        //后续通过单例模式加载
        imageIcon = new ImageIcon(".\\resources\\images\\对战背景.jpg");
        label = new JLabel(imageIcon);
        label.setBounds(0,0,imageIcon.getIconWidth(), imageIcon.getIconHeight());

        add(label);
    }
}
