package com.baizhi.test;

import com.baizhi.Application;
import com.baizhi.dao.EmpDAO;
import com.baizhi.entity.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestDAO {
    @Autowired
    private EmpDAO empDAO;
    @Test
    public void test(){
        Emp emp = empDAO.selectOne(1);
        System.out.println(emp);
    }
}
