package cn.rockets.model;

/**
 * @Auther: YunHai
 * @Date: 2020/4/4 19:26
 * @Description: 对于数据库中user的映射
 */
public class NUser {
    private Integer id;
//    名称
    private String name;
//    密码
    private String password;
//    金钱
    private Integer money;
//    经验
    private Integer exp;
//    等级
    private Integer level;
//    头像路径
    private String handImagePath;

    @Override
    public String toString() {
        return "NUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", money=" + money +
                ", exp=" + exp +
                ", level=" + level +
                ", handImagePath='" + handImagePath + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getHandImagePath() {
        return handImagePath;
    }

    public void setHandImagePath(String handImagePath) {
        this.handImagePath = handImagePath;
    }
}
