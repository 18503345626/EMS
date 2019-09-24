package com.baizhi.entity;

import java.io.Serializable;

public class Admin implements Serializable {
    private Integer admin_Id;
    private String adminname;
    private String password;
    private String realname;
    private String sex;
    public Admin() {
    }

    public Admin(Integer admin_Id, String adminname, String password, String realname, String sex) {
        this.admin_Id = admin_Id;
        this.adminname = adminname;
        this.password = password;
        this.realname = realname;
        this.sex = sex;
    }

    public Integer getAdmin_Id() {
        return admin_Id;
    }

    public void setAdmin_Id(Integer admin_Id) {
        this.admin_Id = admin_Id;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "admin_Id=" + admin_Id +
                ", adminname='" + adminname + '\'' +
                ", password='" + password + '\'' +
                ", realname='" + realname + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
