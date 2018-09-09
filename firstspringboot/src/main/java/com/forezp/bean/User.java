package com.forezp.bean;

public class User {
    private String userNo;
    private String userName;

    public User() {
    }

    public User(String userNo, String userName) {
        super();
        this.userNo = userNo;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User [userNo=" + userNo + ", userName=" + userName + "]";
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
