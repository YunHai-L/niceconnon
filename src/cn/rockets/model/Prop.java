package cn.rockets.model;

/**
 * @Auther: YunHai
 * @Date: 2020/4/5 12:04
 * @Description: 场上道具的映射, 包含坐标和类型
 */
public class Prop {
//    坐标
    public Integer x;
    public Integer y;
//    类型
    private Integer type;


    public Prop(Integer x, Integer y, Integer type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
