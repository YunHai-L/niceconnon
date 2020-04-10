package cn.rockets.model;

import java.util.List;

/**
 * @Auther: YunHai
 * @Date: 2020/4/5 11:32
 * @Description: 对于战场的映射, 包含了双方玩家信息, 回合数, 场上道具等
 */
public class Battlefield {
//    红方
    private Gamer redGamer;
//    蓝方
    private Gamer blueGamer;
//    回合数
    private Integer count;
//    场上道具
    private List<Prop> propList;

    public Gamer getRedGamer() {
        return redGamer;
    }

    public void setRedGamer(Gamer redGamer) {
        this.redGamer = redGamer;
    }

    public Gamer getBlueGamer() {
        return blueGamer;
    }

    public void setBlueGamer(Gamer blueGamer) {
        this.blueGamer = blueGamer;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Prop> getPropList() {
        return propList;
    }

    public void setPropList(List<Prop> propList) {
        this.propList = propList;
    }
}

class Gamer{
//    玩家信息
    private NUser NUser;
//    玩家状态
    private Integer HP;
    private Integer MP;
//    玩家坐标
    private Integer x;
    private Integer y;
//    所持技能
    private Integer[] skill = new Integer[3];
//    炮弹
    private  List<Shell> shells;




    public cn.rockets.model.NUser getNUser() {
        return NUser;
    }

    public void setNUser(cn.rockets.model.NUser NUser) {
        this.NUser = NUser;
    }

    public Integer getHP() {
        return HP;
    }

    public void setHP(Integer HP) {
        this.HP = HP;
    }

    public Integer getMP() {
        return MP;
    }

    public void setMP(Integer MP) {
        this.MP = MP;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer[] getSkill() {
        return skill;
    }

    public void setSkill(Integer[] skill) {
        this.skill = skill;
    }

    public List<Shell> getShells() {
        return shells;
    }

    public void setShells(List<Shell> shells) {
        this.shells = shells;
    }
}
