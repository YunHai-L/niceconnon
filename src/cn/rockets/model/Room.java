package cn.rockets.model;

/**
 * @Auther: YunHai
 * @Date: 2020/4/6 09:26
 * @Description:
 */
public class Room {
    private Integer id;
//    红蓝双方的状态
    private NUser redGamer;
    private NUser blueGamer;
//    红蓝双方的准备状态
    private boolean redReady;
    private boolean blueReady;
//    房间状态
    private Integer state;

    public NUser getRedGamer() {
        return redGamer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setRedGamer(NUser redGamer) {
        this.redGamer = redGamer;
    }

    public NUser getBlueGamer() {
        return blueGamer;
    }

    public void setBlueGamer(NUser blueGamer) {
        this.blueGamer = blueGamer;
    }

    public boolean isRedReady() {
        return redReady;
    }

    public void setRedReady(boolean redReady) {
        this.redReady = redReady;
    }

    public boolean isBlueReady() {
        return blueReady;
    }

    public void setBlueReady(boolean blueReady) {
        this.blueReady = blueReady;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
