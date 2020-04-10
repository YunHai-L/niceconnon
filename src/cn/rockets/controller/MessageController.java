package cn.rockets.controller;

/**
 * @Auther: YunHai
 * @Date: 2020/4/5 11:45
 * @Description: 负责大厅/房间的消息
 */
public interface MessageController {
    /**
     * 向大厅发送消息
     * @param name 发送的用户名
     * @param massage 发送的消息
     * @return 展示的消息 如: [用户]: [message]
     */
    public String sendHall(String name, String massage);

    /**
     * 向房间发送消息
     * @param name 发送的用户名
     * @param massage 发送的消息
     * @param roomId 所在的房间id
     * @return 展示的消息 如: [用户]: [message]
     */
    public String sendRoom(String name, String massage, Integer roomId);
}
