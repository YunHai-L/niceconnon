package cn.rockets.controller.impl;

import cn.rockets.model.Battlefield;
import cn.rockets.model.NUser;
import cn.rockets.controller.RoomController;

/**
 * @Auther: YunHai
 * @Date: 2020/4/5 19:17
 * @Description:
 */
public class RoomControllerImpl implements RoomController {
    @Override
    public String[] getRooms() {
        return new String[0];
    }

    @Override
    public Battlefield inRoom(NUser user, Integer roomId) {
        return null;
    }

    @Override
    public Battlefield ready(Battlefield battlefield, NUser user) {
        return null;
    }
}
