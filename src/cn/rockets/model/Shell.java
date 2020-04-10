package cn.rockets.model;

/**
 * @Auther: YunHai
 * @Date: 2020/4/5 10:56
 * @Description: 炮弹, 创建时传入角度和力度
 *  如果需要从角色的坐标作为起始点, 'getx()/gety()'加上'玩家坐标'即可
 */
public class Shell {
//    窗口的高度
    private final int HEIGHT = 847;
//    重力
    private int g=10;
//    x和y方向的力
    private float vx, vy;
//    发射时的起始点
    private int startx, starty;
//    发射延迟
    private int time;

    /**
     *  需要注意的是, 受到爆炸机制影响, 炮弹的起始点不能为玩家坐标范围内
     * @param angle 角度
     * @param v 力度
     */
    public Shell(int angle, int v, int startx, int starty){
        this.startx = startx;
        this.starty = starty;
        vx = v*(float)Math.cos(angle*3.14159265359/180);
        vy = v*(float)Math.sin(angle*3.14159265359/180);
    }

    /**
     * 在指定时间时, 该炮弹的位置
     * @param t 时间
     * @return 炮弹的坐标
     */
    public int getX(float t) { return (int)(vx*t)+startx; }
    public int getY(float t){
        return (int)(HEIGHT-(vy*t-g/2*t*t)+starty);
    }
}
