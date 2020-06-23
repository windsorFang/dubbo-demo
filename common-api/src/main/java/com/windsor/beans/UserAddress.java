package com.windsor.beans;

import java.io.Serializable;

/**
 * 用户地址bean
 */
public class UserAddress implements Serializable {

    private Integer id;

    private String address;

    private String userId;

    private String phoneNum;

    public UserAddress() {
    }

    public UserAddress(Integer id, String address, String userId, String phoneNum) {
        this.id = id;
        this.address = address;
        this.userId = userId;
        this.phoneNum = phoneNum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "UserAddress{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", userId='" + userId + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}
