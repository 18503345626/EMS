package com.baizhi.service.impl;

import com.baizhi.dao.EmpDAO;
import com.baizhi.entity.Emp;
import com.baizhi.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpDAO empDAO;

//    public void setEmpDAO(EmpDAO empDAO) {
//        this.empDAO = empDAO;
//    }

    @Override
    public void modifyDeleteById(Integer empId) {
        empDAO.deleteById(empId);
    }

    @Override
    public void modifyaddOne(Emp emp) {
        empDAO.addOne(emp);
    }
    @Transactional(propagation = Propagation.SUPPORTS , readOnly = true)
    @Override
    public Emp selectOne(Integer empId) {
        return  empDAO.selectOne(empId);
    }

    @Override
    public void modifyUpdateOne(Emp emp) {
        empDAO.updateOne(emp);
    }
}
