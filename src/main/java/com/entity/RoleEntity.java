package com.entity;

import javax.persistence.*;
import java.util.List;

/**
 * @description:
 * @author: Qiao.Jian
 * @create: 2018-09-20 19:10
 */
@Entity
@Table(name = "role", schema = "scgame", catalog = "")
@IdClass(RoleEntityPK.class)
public class RoleEntity {
    private Long seqid;
    private String no;
    private String name;
    private Integer type;
    private String remark;

    @OneToOne(mappedBy = "refrole")
    private UsersroleEntity refusersrole;

    @Id
    @Column(name = "seqid", nullable = false)
    public Long getSeqid() {
        return seqid;
    }

    public void setSeqid(Long seqid) {
        this.seqid = seqid;
    }

    @Id
    @Column(name = "no", nullable = false, length = 20)
    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "type", nullable = true)
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Basic
    @Column(name = "remark", nullable = true, length = 100)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;

        RoleEntity that = (RoleEntity) o;

        if (seqid != that.seqid) return false;
        if (no != null ? !no.equals ( that.no ) : that.no != null) return false;
        if (name != null ? !name.equals ( that.name ) : that.name != null) return false;
        if (type != null ? !type.equals ( that.type ) : that.type != null) return false;
        if (remark != null ? !remark.equals ( that.remark ) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (seqid ^ (seqid >>> 32));
        result = 31 * result + (no != null ? no.hashCode () : 0);
        result = 31 * result + (name != null ? name.hashCode () : 0);
        result = 31 * result + (type != null ? type.hashCode () : 0);
        result = 31 * result + (remark != null ? remark.hashCode () : 0);
        return result;
    }
}
