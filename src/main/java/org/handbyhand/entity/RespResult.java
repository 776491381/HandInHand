package org.handbyhand.entity;

/**
 * Created by fyy on 6/27/17.
 */
public class RespResult {

    private boolean success;
    private UserInfo userInfo;
    private int state;
    private String message;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public RespResult(boolean success, int state, String message) {
        this.state = state;
        this.success = success;
        this.message = message;
    }

    public RespResult(boolean success, UserInfo userInfo, int state, String message) {
        this.success = success;
        this.userInfo = userInfo;
        this.state = state;
        this.message = message;
    }

    @Override
    public String toString() {
        return "RespResult{" +
                "success=" + success +
                ", userInfo=" + userInfo +
                ", state=" + state +
                ", message='" + message + '\'' +
                '}';
    }
}
