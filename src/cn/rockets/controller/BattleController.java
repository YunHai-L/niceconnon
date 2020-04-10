package cn.rockets.controller;

import cn.rockets.model.Battlefield;
import cn.rockets.model.MyResult;
import cn.rockets.model.Shell;

/**
 * @Auther: YunHai
 * @Date: 2020/4/5 11:34
 * @Description: 战斗controller
 */
public interface BattleController {

    /**
     * 根据type创建炮弹
     * @param type 散射, 连射
     * @param angle 角度
     * @param v 力度
     * @return state:200 obj=Sheel. 平a
     *         state:201 obj=List<Shell>. 散射. 炮弹1 angle+15. 炮弹3 angle-15.
     *         state:202 obj=Shell. 5连射
     */
    MyResult createBattle(Integer type, Integer angle, Integer v);

    /**
     * 发射炮弹, 谁有谁发射.
     * @param battlefield 战场
     * @param damage 伤害值
     * @return 需要注意的是, 炮弹是不分对象的. 自己的炮弹 自己也会受到伤害.
     */
    void biu(Battlefield battlefield, Integer damage, Integer type);







}
