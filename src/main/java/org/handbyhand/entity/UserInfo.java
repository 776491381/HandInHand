package org.handbyhand.entity;

/**
 * Created by iff on 2017/6/27.
 */
public class UserInfo {

    private String username;
    private String passwd;
    private String userId;

    public String getPasswd() {
        return passwd;
    }

    public String getUserId() {
        return userId;
    }

    public UserInfo(String username, String passwd) {
        this.username = username;
        this.passwd = passwd;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "username='" + username + '\'' +
                ", passwd='" + passwd + '\'' +
                '}';
    }
}
