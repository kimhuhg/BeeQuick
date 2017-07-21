package com.java1702.beequick.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "t_product", schema = "beequick", catalog = "")
public class Product {
    private String productId;
    private String productTitle;
    private Double price;
    private String unit;
    private String brand;
    private Integer soldNum;
    private Integer stockQuantity;
    private String classifyId;
    private String state;
    private Timestamp createtime;

    @Id
    @Column(name = "PRODUCT_ID", nullable = false, length = 32)
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "PRODUCT_TITLE", nullable = false, length = 50)
    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    @Basic
    @Column(name = "PRICE", nullable = true, precision = 2)
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "UNIT", nullable = false, length = 50)
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Basic
    @Column(name = "BRAND", nullable = false, length = 50)
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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
    @Column(name = "STOCK_QUANTITY", nullable = true)
    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    @Basic
    @Column(name = "CLASSIFY_ID", nullable = false, length = 32)
    public String getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(String classifyId) {
        this.classifyId = classifyId;
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

        Product product = (Product) o;

        if (productId != null ? !productId.equals(product.productId) : product.productId != null) return false;
        if (productTitle != null ? !productTitle.equals(product.productTitle) : product.productTitle != null)
            return false;
        if (price != null ? !price.equals(product.price) : product.price != null) return false;
        if (unit != null ? !unit.equals(product.unit) : product.unit != null) return false;
        if (brand != null ? !brand.equals(product.brand) : product.brand != null) return false;
        if (soldNum != null ? !soldNum.equals(product.soldNum) : product.soldNum != null) return false;
        if (stockQuantity != null ? !stockQuantity.equals(product.stockQuantity) : product.stockQuantity != null)
            return false;
        if (classifyId != null ? !classifyId.equals(product.classifyId) : product.classifyId != null) return false;
        if (state != null ? !state.equals(product.state) : product.state != null) return false;
        if (createtime != null ? !createtime.equals(product.createtime) : product.createtime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productId != null ? productId.hashCode() : 0;
        result = 31 * result + (productTitle != null ? productTitle.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (soldNum != null ? soldNum.hashCode() : 0);
        result = 31 * result + (stockQuantity != null ? stockQuantity.hashCode() : 0);
        result = 31 * result + (classifyId != null ? classifyId.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (createtime != null ? createtime.hashCode() : 0);
        return result;
    }
}
