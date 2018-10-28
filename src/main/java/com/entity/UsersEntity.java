package com.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @description:
 * @author: Qiao.Jian
 * @create: 2018-09-21 16:28
 */
@Entity
@Table(name = "users", schema = "scgame", catalog = "")
@IdClass(UsersEntityPK.class)
public class UsersEntity {
    private Long seqId;
    private String userLogNo;
    private String userPassword;
    private Short superMan;
    private String trueName;
    private String bindIp;
    private Short inUse;
    private String tel;
    private String email;
    private String webchat;

    @Id
    @Column(name = "SeqId", nullable = false)
    public Long getSeqId() {
        return seqId;
    }

    public void setSeqId(Long seqId) {
        this.seqId = seqId;
    }

    @Id
    @Column(name = "UserLogNo", nullable = false, length = 30)
    public String getUserLogNo() {
        return userLogNo;
    }

    public void setUserLogNo(String userLogNo) {
        this.userLogNo = userLogNo;
    }

    @Basic
    @Column(name = "UserPassword", nullable = false, length = 50)
    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Basic
    @Column(name = "SuperMan", nullable = false)
    public Short getSuperMan() {
        return superMan;
    }

    public void setSuperMan(Short superMan) {
        this.superMan = superMan;
    }

    @Basic
    @Column(name = "TrueName", nullable = false, length = 30)
    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    @Basic
    @Column(name = "BindIp", nullable = true, length = 100)
    public String getBindIp() {
        return bindIp;
    }

    public void setBindIp(String bindIp) {
        this.bindIp = bindIp;
    }

    @Basic
    @Column(name = "InUse", nullable = false)
    public Short getInUse() {
        return inUse;
    }

    public void setInUse(Short inUse) {
        this.inUse = inUse;
    }

    @Basic
    @Column(name = "Tel", nullable = true, length = 60)
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Basic
    @Column(name = "Email", nullable = true, length = 512)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "webchat", nullable = true, length = 30)
    public String getWebchat() {
        return webchat;
    }

    public void setWebchat(String webchat) {
        this.webchat = webchat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        UsersEntity that = (UsersEntity) o;
        return seqId == that.seqId &&
                superMan == that.superMan &&
                inUse == that.inUse &&
                Objects.equals ( userLogNo, that.userLogNo ) &&
                Objects.equals ( userPassword, that.userPassword ) &&
                Objects.equals ( trueName, that.trueName ) &&
                Objects.equals ( bindIp, that.bindIp ) &&
                Objects.equals ( tel, that.tel ) &&
                Objects.equals ( email, that.email ) &&
                Objects.equals ( webchat, that.webchat );
    }

    @Override
    public int hashCode() {

        return Objects.hash ( seqId, userLogNo, userPassword, superMan, trueName, bindIp, inUse, tel, email, webchat );
    }
}
