package com.java1702.beequick.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "t_collect", schema = "beequick", catalog = "")
public class Collect {
    private String collectId;
    private String productId;
    private String phone;
    private String state;
    private Timestamp createtime;

    @Id
    @Column(name = "COLLECT_ID", nullable = false, length = 32)
    public String getCollectId() {
        return collectId;
    }

    public void setCollectId(String collectId) {
        this.collectId = collectId;
    }

    @Basic
    @Column(name = "PRODUCT_ID", nullable = false, length = 32)
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "PHONE", nullable = false, length = 20)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

        Collect collect = (Collect) o;

        if (collectId != null ? !collectId.equals(collect.collectId) : collect.collectId != null) return false;
        if (productId != null ? !productId.equals(collect.productId) : collect.productId != null) return false;
        if (phone != null ? !phone.equals(collect.phone) : collect.phone != null) return false;
        if (state != null ? !state.equals(collect.state) : collect.state != null) return false;
        if (createtime != null ? !createtime.equals(collect.createtime) : collect.createtime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = collectId != null ? collectId.hashCode() : 0;
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (createtime != null ? createtime.hashCode() : 0);
        return result;
    }
}
