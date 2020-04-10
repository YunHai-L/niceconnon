package cn.rockets.view;

import javax.swing.*;

/**
 * 层叠面板
 * @author 张叔叔
 * @version 1.0
 * @copyright
 */
public class StackPaneDemo extends JLayeredPane {
    BackGroundView backGroundView = null;           //背景层
    ModuleShowView moduleShowView = null;           //组件显示层
    RoleShowView roleShowView = null;               //角色显示层

    public StackPaneDemo(BackGroundView backGroundView, ModuleShowView moduleShowView,RoleShowView roleShowView) {
        this.backGroundView = backGroundView;
        this.moduleShowView = moduleShowView;
        this.roleShowView = roleShowView;
        init();
        assemble();
    }

    /**
     * 初始化控件
     */
    private void init() {
        setLayout(null);
        setBounds(0,0,1442,847);
        setOpaque(false);
    }

    /**
     * 组装控件
     */
    private void assemble(){
        add(backGroundView, new Integer(0));
        add(roleShowView, new Integer(1));
        add(moduleShowView, new Integer(2));
    }
}
