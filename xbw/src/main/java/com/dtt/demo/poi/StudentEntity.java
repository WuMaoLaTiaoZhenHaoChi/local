package com.dtt.demo.poi;

import cn.afterturn.easypoi.excel.annotation.Excel;

import java.io.Serializable;

/**
 * @Author: duant
 * @Date: 2020/3/3 18:07
 * @Description:
 */
public class StudentEntity implements Serializable {

    public StudentEntity() {
    }

    /**
     * 学生姓名
     */
    @Excel(name = "name")
    private String name;
    /**
     * 学生性别
     */
    @Excel(name = "sex")
    private int sex;

    @Excel(name = "birthday", databaseFormat = "yyyyMMddHHmmss", format = "yyyy-MM-dd")
    private String birthday;

    @Excel(name = "registrationDate", databaseFormat = "yyyyMMddHHmmss", format = "yyyy-MM-dd")
    private String registrationDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", birthday='" + birthday + '\'' +
                ", registrationDate='" + registrationDate + '\'' +
                '}';
    }
}