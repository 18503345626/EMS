package com.baizhi.entity;

import java.io.Serializable;

/**
 * 员工类
 */
public class Emp implements Serializable {
    private  Integer emp_id;
    private  String empname;
    private Integer age;
    private Double salary;
    private Integer dept_id;
    private String cover;

    public Emp() {
    }

    public Emp(Integer emp_id, String empname, Integer age, Double salary, Integer dept_id, String cover) {
        this.emp_id = emp_id;
        this.empname = empname;
        this.age = age;
        this.salary = salary;
        this.dept_id = dept_id;
        this.cover = cover;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getDept_id() {
        return dept_id;
    }

    public void setDept_id(Integer dept_id) {
        this.dept_id = dept_id;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "emp_id=" + emp_id +
                ", empname='" + empname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", dept_id=" + dept_id +
                ", cover='" + cover + '\'' +
                '}';
    }
}
