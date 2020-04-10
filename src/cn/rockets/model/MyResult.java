package cn.rockets.model;

/**
 * @Auther: YunHai
 * @Date: 2020/4/5 11:12
 * @Description: 作为controller的返回值
 */
public class MyResult {
    private static final int DEFAULT = 200;
//    状态码
    private int state;
//    提示信息
    private String msg;
//    返回值
    private Object result;

    public static MyResult ok(){
        return new MyResult();
    }
    public static MyResult ok(Object object){
        return new MyResult(DEFAULT, "OK", object);
    }
    public static MyResult build(int state, String msg){
        return new MyResult(state, msg, null);
    }
    public static MyResult build(int state, String msg, Object result){
        return new MyResult(state, msg, result);
    }

    public MyResult(int state, String msg, Object result) {
        this.state = state;
        this.msg = msg;
        this.result = result;
    }

    public MyResult(){
        state = DEFAULT;
        msg = "OK";
    }

    public static int getDEFAULT() {
        return DEFAULT;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }


}
