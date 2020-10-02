/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pm.model;

/**
 *
 * @author personal
 */
public class User {
    private int UserId;
    private String UserName;
    private String UserEmail;
    private String UserContactNumber1;
    private String UserContactNumber2;
    private String Password;
    private int UserStatus;
    private String UserRemark;

    /**
     * @return the UserId
     */
    public int getUserId() {
        return UserId;
    }

    /**
     * @param UserId the UserId to set
     */
    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    /**
     * @return the UserName
     */
    public String getUserName() {
        return UserName;
    }

    /**
     * @param UserName the UserName to set
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * @return the UserEmail
     */
    public String getUserEmail() {
        return UserEmail;
    }

    /**
     * @param UserEmail the UserEmail to set
     */
    public void setUserEmail(String UserEmail) {
        this.UserEmail = UserEmail;
    }

    /**
     * @return the UserContactNumber1
     */
    public String getUserContactNumber1() {
        return UserContactNumber1;
    }

    /**
     * @param UserContactNumber1 the UserContactNumber1 to set
     */
    public void setUserContactNumber1(String UserContactNumber1) {
        this.UserContactNumber1 = UserContactNumber1;
    }

    /**
     * @return the UserContactNumber2
     */
    public String getUserContactNumber2() {
        return UserContactNumber2;
    }

    /**
     * @param UserContactNumber2 the UserContactNumber2 to set
     */
    public void setUserContactNumber2(String UserContactNumber2) {
        this.UserContactNumber2 = UserContactNumber2;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * @return the UserStatus
     */
    public int getUserStatus() {
        return UserStatus;
    }

    /**
     * @param UserStatus the UserStatus to set
     */
    public void setUserStatus(int UserStatus) {
        this.UserStatus = UserStatus;
    }

    /**
     * @return the UserRemark
     */
    public String getUserRemark() {
        return UserRemark;
    }

    /**
     * @param UserRemark the UserRemark to set
     */
    public void setUserRemark(String UserRemark) {
        this.UserRemark = UserRemark;
    }

}
