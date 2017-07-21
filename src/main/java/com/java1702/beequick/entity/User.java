package com.java1702.beequick.entity;

import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "t_user", schema = "beequick")
public class User {
    private String phone;
    private String imagePath;
    private String state;
    private Timestamp createtime;

    @Id
    @NaturalId
    @Column(name = "PHONE", nullable = false, length = 20)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "IMAGE_PATH", nullable = true, length = 200)
    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
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

        User user = (User) o;

        if (phone != null ? !phone.equals(user.phone) : user.phone != null) return false;
        if (imagePath != null ? !imagePath.equals(user.imagePath) : user.imagePath != null) return false;
        if (state != null ? !state.equals(user.state) : user.state != null) return false;
        if (createtime != null ? !createtime.equals(user.createtime) : user.createtime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = phone != null ? phone.hashCode() : 0;
        result = 31 * result + (imagePath != null ? imagePath.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (createtime != null ? createtime.hashCode() : 0);
        return result;
    }
}
