package com.java1702.beequick.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "t_keyword", schema = "beequick", catalog = "")
public class Keyword {
    private String keywordId;
    private String keyword;
    private Integer number;
    private String state;
    private Timestamp createtime;

    @Id
    @Column(name = "KEYWORD_ID", nullable = false, length = 32)
    public String getKeywordId() {
        return keywordId;
    }

    public void setKeywordId(String keywordId) {
        this.keywordId = keywordId;
    }

    @Basic
    @Column(name = "KEYWORD", nullable = false, length = 100)
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Basic
    @Column(name = "NUMBER", nullable = true)
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Basic
    @Column(name = "STATE", nullable = true, length = 2)
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

        Keyword keyword1 = (Keyword) o;

        if (keywordId != null ? !keywordId.equals(keyword1.keywordId) : keyword1.keywordId != null) return false;
        if (keyword != null ? !keyword.equals(keyword1.keyword) : keyword1.keyword != null) return false;
        if (number != null ? !number.equals(keyword1.number) : keyword1.number != null) return false;
        if (state != null ? !state.equals(keyword1.state) : keyword1.state != null) return false;
        if (createtime != null ? !createtime.equals(keyword1.createtime) : keyword1.createtime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = keywordId != null ? keywordId.hashCode() : 0;
        result = 31 * result + (keyword != null ? keyword.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (createtime != null ? createtime.hashCode() : 0);
        return result;
    }
}
