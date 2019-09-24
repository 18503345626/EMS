package com.baizhi.dao;

import com.baizhi.entity.Admin;

import java.util.List;

public interface AdminDAO {
    Admin selectByAdmin(Admin admin);
    void addAdmin(Admin admin);

    void addOneAdmin(Admin admin);

    List<Admin> selectAll();
}
