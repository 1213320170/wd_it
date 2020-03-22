package com.wd.job.pojo;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "compagnie")
public class Compagnie {
    @Id
    private Integer cid ;
    private String caree ;
    private String type ;
    private String trade ;
    private String phone2 ;
    private String phone ;
    private String fax ;
    private String fax2 ;
    private String fax22 ;
    private String fax222 ;
    private String salary ;
    private String salary2 ;
    private String other ;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCaree() {
        return caree;
    }

    public void setCaree(String caree) {
        this.caree = caree;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTrade() {
        return trade;
    }

    public void setTrade(String trade) {
        this.trade = trade;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getFax2() {
        return fax2;
    }

    public void setFax2(String fax2) {
        this.fax2 = fax2;
    }

    public String getFax22() {
        return fax22;
    }

    public void setFax22(String fax22) {
        this.fax22 = fax22;
    }

    public String getFax222() {
        return fax222;
    }

    public void setFax222(String fax222) {
        this.fax222 = fax222;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getSalary2() {
        return salary2;
    }

    public void setSalary2(String salary2) {
        this.salary2 = salary2;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}

