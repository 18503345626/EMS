package com.baizhi.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 部门类
 */
public class Dept implements Serializable {
    private  Integer dept_id;
    private  String deptname;
    private  String code;
    private List<Emp> list;
    public Dept() {
    }

    public Dept(Integer dept_id, String deptname, String code, List<Emp> list) {
        this.dept_id = dept_id;
        this.deptname = deptname;
        this.code = code;
        this.list = list;
    }

    public Integer getDept_id() {
        return dept_id;
    }

    public void setDept_id(Integer dept_id) {
        this.dept_id = dept_id;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Emp> getList() {
        return list;
    }

    public void setList(List<Emp> list) {
        this.list = list;
    }


    @Override
    public String toString() {
        return "Dept{" +
                "dept_id=" + dept_id +
                ", deptname='" + deptname + '\'' +
                ", code='" + code + '\'' +
                ", list=" + list +
                '}';
    }
}
