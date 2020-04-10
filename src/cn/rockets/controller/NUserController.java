package cn.rockets.controller;

import cn.rockets.model.MyResult;
import cn.rockets.model.NUser;

import java.io.File;

/**
 * @Auther: YunHai
 * @Date: 2020/4/4 19:46
 * @Description: 负责对user的操作
 */
public interface NUserController {
    /**
     *
     * @param username 用户名
     * @param password 用户密码
     * @return state200: obj= user对象
     *          state 100: msg= 用户名或密码错误
     */
    public MyResult login(String username, String password);

    /**
     * 需要注意的是, password在插入前需要进行加密
     * @param username 用户名
     * @param password 用户密码
     * @param password2 确认密码
     * @return state200: msg= 注册成功, obj= user对象
     *          state50: msg= 用户名已被注册
     *          state51: msg= 两次密码输入不一致
     */
    public MyResult register(String username, String password, String password2);

    /**
     * 修改用户名
     * @param id 用户id
     * @param username newUsername
     * @return state200: msg=修改成功, obj=修改后的用户
     *         state100: msg=该用户名已被占用
     */
    public NUser updateNUserName(Integer id, String username);


}
