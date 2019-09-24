package com.baizhi.dao;

import com.baizhi.entity.Emp;

public interface EmpDAO {

    void deleteById(Integer empId);

    void addOne(Emp emp);

    Emp selectOne(Integer empId);

    void updateOne(Emp emp);
}
