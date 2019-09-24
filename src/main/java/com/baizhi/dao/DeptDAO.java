package com.baizhi.dao;

import com.baizhi.entity.Dept;

import java.util.List;

public interface DeptDAO {
    List<Dept> selectAll();

    void modifyaddDept(Dept dept);

    Dept selectById(Integer id);

    void updateOne(Dept dept);
}
