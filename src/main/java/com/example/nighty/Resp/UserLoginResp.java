package com.example.nighty.Resp;

/**
 * @Description
 * @Author Jessica
 * @Version v
 * @Date 2021/10/7
 */
public class UserLoginResp {

    private Long id;

    private String username;

    private String mobile;

    private String token;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserLoginResp{");
        sb.append("id=").append(id);
        sb.append(", username='").append(username).append('\'');
        sb.append(", mobile='").append(mobile).append('\'');
        sb.append(", token='").append(token).append('\'');
        sb.append('}');
        return sb.toString();
    }
}