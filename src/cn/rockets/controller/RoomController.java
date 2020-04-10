package cn.rockets.controller;

import cn.rockets.model.Battlefield;
import cn.rockets.model.NUser;

/**
 * @Auther: YunHai
 * @Date: 2020/4/5 12:18
 * @Description:
 */
public interface RoomController {
    /**
     * 从服务器获取房间的外部状态,(等待, 战斗, 空闲)
     * @return String[] = {"房间[x](state)","房间[x](state)"....}
     */
    public String[] getRooms();

    /**
     * 进入指定房间, 向服务器发送相应信息
     * @param user user对象
     * @param roomId 房间号
     * @return 房间信息
     */
    public Battlefield inRoom(NUser user, Integer roomId);

    /**
     * 我方准备或取消准备, 向服务器发送相应信息
     * @param user 用户
     * @return 房间信息
     */
    public Battlefield ready(Battlefield battlefield, NUser user);
}
