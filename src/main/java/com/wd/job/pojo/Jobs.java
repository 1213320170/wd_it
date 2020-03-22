package com.wd.job.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "jobs")
public class Jobs {
    @Id
    private Integer eid;
    private String caree ;

    private String downtime ;

    private String types ;
    private Integer nums ;

    private Integer career;
    private Integer num;
    private Integer age1;
    private Integer age2;
    private String sex ;
    private String eduid ;
    private Integer workyear ;
    private String engage ;
    private String salary ;
    private String workaddr ;
    private String date_y;
    private String date_m;
    private String date_d;
    private String uptime ;
    private Integer avatime;
    private String dayAdd ;
    private Integer bys ;
    private String other ;

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getCaree() {
        return caree;
    }

    public void setCaree(String caree) {
        this.caree = caree;
    }

    public String getUptime() {
        if (uptime == null){
            uptime = date_y+"-"+date_m+"-"+date_d;
        }
        return uptime;
    }

   /* public void setUptime(String uptime) {
        this.uptime = uptime;
    }*/

    public String getDowntime() {
        return downtime;
    }

    public void setDowntime(String downtime) {
        this.downtime = downtime;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public Integer getNums() {
        return nums;
    }

    public void setNums(Integer nums) {
        this.nums = nums;
    }

    public Integer getCareer() {
        return career;
    }

    public void setCareer(Integer career) {
        this.career = career;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getAge1() {
        return age1;
    }

    public void setAge1(Integer age1) {
        this.age1 = age1;
    }

    public Integer getAge2() {
        return age2;
    }

    public void setAge2(Integer age2) {
        this.age2 = age2;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEduid() {
        return eduid;
    }

    public void setEduid(String eduid) {
        this.eduid = eduid;
    }

    public Integer getWorkyear() {
        return workyear;
    }

    public void setWorkyear(Integer workyear) {
        this.workyear = workyear;
    }

    public String getEngage() {
        return engage;
    }

    public void setEngage(String engage) {
        this.engage = engage;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getWorkaddr() {
        return workaddr;
    }

    public void setWorkaddr(String workaddr) {
        this.workaddr = workaddr;
    }

    public String getDate_y() {
        return date_y;
    }

    public void setDate_y(String date_y) {
        this.date_y = date_y;
    }

    public String getDate_m() {
        return date_m;
    }

    public void setDate_m(String date_m) {
        this.date_m = date_m;
    }

    public String getDate_d() {
        return date_d;
    }

    public void setDate_d(String date_d) {
        this.date_d = date_d;
    }

    public Integer getAvatime() {
        return avatime;
    }

    public void setAvatime(Integer avatime) {
        this.avatime = avatime;
    }

    public String getDayAdd() {
        return dayAdd;
    }

    public void setDayAdd(String dayAdd) {
        this.dayAdd = dayAdd;
    }

    public Integer getBys() {
        return bys;
    }

    public void setBys(Integer bys) {
        this.bys = bys;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}

