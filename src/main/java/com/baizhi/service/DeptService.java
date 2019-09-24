package com.baizhi.service;

import com.baizhi.entity.Dept;

import java.util.List;

public interface DeptService {

    List<Dept> selectAll();


    void modifyaddDept(Dept dept);


    Dept selectById(Integer id);

    void modifyUpdateOne(Dept dept);
}
