package com.baizhi.service.impl;

import com.baizhi.dao.DeptDAO;
import com.baizhi.entity.Dept;
import com.baizhi.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDAO deptDAO;

//    public void setDeptDAO(DeptDAO deptDAO) {
//        this.deptDAO = deptDAO;
//    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS , readOnly = true)
    public List<Dept> selectAll() {
        return deptDAO.selectAll();
    }

    @Override
    public void modifyaddDept(Dept dept) {
        deptDAO.modifyaddDept(dept);
    }
    @Transactional(propagation = Propagation.SUPPORTS , readOnly = true)
    @Override
    public Dept selectById(Integer id) {
        Dept dept= deptDAO.selectById(id);
        return dept;
    }

    @Override
    public void modifyUpdateOne(Dept dept) {
        deptDAO.updateOne(dept);
    }


}
