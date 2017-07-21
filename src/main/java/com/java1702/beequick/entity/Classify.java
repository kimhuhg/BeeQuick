package com.java1702.beequick.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "t_classify", schema = "beequick", catalog = "")
public class Classify {
    private String classifyId;
    private String classifyTitle;
    private String isBanner;
    private Integer soldNum;
    private String state;
    private Timestamp createtime;

    @Id
    @Column(name = "CLASSIFY_ID", nullable = false, length = 32)
    public String getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(String classifyId) {
        this.classifyId = classifyId;
    }

    @Basic
    @Column(name = "CLASSIFY_TITLE", nullable = false, length = 50)
    public String getClassifyTitle() {
        return classifyTitle;
    }

    public void setClassifyTitle(String classifyTitle) {
        this.classifyTitle = classifyTitle;
    }

    @Basic
    @Column(name = "IS_BANNER", nullable = true, length = 1)
    public String getIsBanner() {
        return isBanner;
    }

    public void setIsBanner(String isBanner) {
        this.isBanner = isBanner;
    }

    @Basic
    @Column(name = "SOLD_NUM", nullable = true)
    public Integer getSoldNum() {
        return soldNum;
    }

    public void setSoldNum(Integer soldNum) {
        this.soldNum = soldNum;
    }

    @Basic
    @Column(name = "STATE", nullable = true, length = 1)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "CREATETIME", nullable = false)
    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Classify classify = (Classify) o;

        if (classifyId != null ? !classifyId.equals(classify.classifyId) : classify.classifyId != null) return false;
        if (classifyTitle != null ? !classifyTitle.equals(classify.classifyTitle) : classify.classifyTitle != null)
            return false;
        if (isBanner != null ? !isBanner.equals(classify.isBanner) : classify.isBanner != null) return false;
        if (soldNum != null ? !soldNum.equals(classify.soldNum) : classify.soldNum != null) return false;
        if (state != null ? !state.equals(classify.state) : classify.state != null) return false;
        if (createtime != null ? !createtime.equals(classify.createtime) : classify.createtime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = classifyId != null ? classifyId.hashCode() : 0;
        result = 31 * result + (classifyTitle != null ? classifyTitle.hashCode() : 0);
        result = 31 * result + (isBanner != null ? isBanner.hashCode() : 0);
        result = 31 * result + (soldNum != null ? soldNum.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (createtime != null ? createtime.hashCode() : 0);
        return result;
    }
}
