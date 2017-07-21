package com.java1702.beequick.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "t_image", schema = "beequick", catalog = "")
public class Image {
    private String imageId;
    private String picPath;
    private String classifyId;
    private String productId;
    private String type;
    private String state;
    private Timestamp createtime;

    @Id
    @Column(name = "IMAGE_ID", nullable = false, length = 32)
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    @Basic
    @Column(name = "PIC_PATH", nullable = false, length = 200)
    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    @Basic
    @Column(name = "CLASSIFY_ID", nullable = true, length = 32)
    public String getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(String classifyId) {
        this.classifyId = classifyId;
    }

    @Basic
    @Column(name = "PRODUCT_ID", nullable = true, length = 32)
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "TYPE", nullable = false, length = 1)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

        Image image = (Image) o;

        if (imageId != null ? !imageId.equals(image.imageId) : image.imageId != null) return false;
        if (picPath != null ? !picPath.equals(image.picPath) : image.picPath != null) return false;
        if (classifyId != null ? !classifyId.equals(image.classifyId) : image.classifyId != null) return false;
        if (productId != null ? !productId.equals(image.productId) : image.productId != null) return false;
        if (type != null ? !type.equals(image.type) : image.type != null) return false;
        if (state != null ? !state.equals(image.state) : image.state != null) return false;
        if (createtime != null ? !createtime.equals(image.createtime) : image.createtime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = imageId != null ? imageId.hashCode() : 0;
        result = 31 * result + (picPath != null ? picPath.hashCode() : 0);
        result = 31 * result + (classifyId != null ? classifyId.hashCode() : 0);
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (createtime != null ? createtime.hashCode() : 0);
        return result;
    }
}
