package com.rbac.dao.bean;

import java.util.Date;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author xuyuyong
 * @since 2018-09-12
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    /**
     * 姓名
     */
    private String username;
    /**
     * 登录地址
     */
    private String loginacct;
    /**
     * 密码
     */
    private String userpswd;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 创建时间
     */
    private Date createtime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLoginacct() {
        return loginacct;
    }

    public void setLoginacct(String loginacct) {
        this.loginacct = loginacct;
    }

    public String getUserpswd() {
        return userpswd;
    }

    public void setUserpswd(String userpswd) {
        this.userpswd = userpswd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }


    @Override
    public String toString() {
        return "User{" +
        ", id=" + id +
        ", username=" + username +
        ", loginacct=" + loginacct +
        ", userpswd=" + userpswd +
        ", email=" + email +
        ", createtime=" + createtime +
        "}";
    }
}
