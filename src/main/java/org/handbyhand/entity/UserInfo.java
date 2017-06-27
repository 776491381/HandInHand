package org.handbyhand.entity;

/**
 * Created by iff on 2017/6/27.
 */
public class UserInfo {

    private String username;
    private String passwd;
//    private String userid;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


//    public String getPasswd() {
//        return passwd;
//    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }


//    public String getUserid() {
//        return userid;
//    }

//    public void setUserid(String userid) {
//        this.userid = userid;
//    }


    @Override
    public String toString() {
        return "UserInfo{" +
                "username='" + username + '\'' +
                ", passwd='" + passwd + '\'' +
                '}';
    }
}
