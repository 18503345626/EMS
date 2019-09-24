package com.baizhi.service;

import com.baizhi.entity.Emp;

public interface EmpService {


    void modifyDeleteById(Integer empId);

    void modifyaddOne(Emp emp);

    Emp selectOne(Integer empId);

    void modifyUpdateOne(Emp emp);
}
