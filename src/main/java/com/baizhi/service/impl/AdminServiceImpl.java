package com.baizhi.service.impl;

import com.baizhi.dao.AdminDAO;
import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDAO adminDAO;

//    public void setAdminDAO(AdminDAO adminDAO) {
//        this.adminDAO = adminDAO;
//    }
    @Transactional(propagation = Propagation.SUPPORTS , readOnly = true)
    @Override
    public Admin login(Admin admin) {
        Admin ad = adminDAO.selectByAdmin(admin);
        if (ad==null) throw new RuntimeException("用户名或密码错误");
        return ad;
    }

    @Override
    public void modifyRegister(Admin admin) {
        adminDAO.addOneAdmin(admin);
    }
}
