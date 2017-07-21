package com.java1702.beequick.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "t_cart_product", schema = "beequick", catalog = "")
public class CartProduct {
    private String cartpId;
    private String productId;
    private int num;
    private String isChecked;
    private String phone;
    private String state;
    private Timestamp createtime;

    @Id
    @Column(name = "CARTP_ID", nullable = false, length = 32)
    public String getCartpId() {
        return cartpId;
    }

    public void setCartpId(String cartpId) {
        this.cartpId = cartpId;
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
    @Column(name = "NUM", nullable = false)
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Basic
    @Column(name = "IS_CHECKED", nullable = true, length = 1)
    public String getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(String isChecked) {
        this.isChecked = isChecked;
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

        CartProduct that = (CartProduct) o;

        if (num != that.num) return false;
        if (cartpId != null ? !cartpId.equals(that.cartpId) : that.cartpId != null) return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (isChecked != null ? !isChecked.equals(that.isChecked) : that.isChecked != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (createtime != null ? !createtime.equals(that.createtime) : that.createtime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cartpId != null ? cartpId.hashCode() : 0;
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + num;
        result = 31 * result + (isChecked != null ? isChecked.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (createtime != null ? createtime.hashCode() : 0);
        return result;
    }
}
