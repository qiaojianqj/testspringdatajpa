package com.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @description:
 * @author: Qiao.Jian
 * @create: 2018-09-21 15:00
 */
@Entity
@Table(name = "privilege", schema = "scgame", catalog = "")
public class PrivilegeEntity {
    private Long seqid;
    private Integer type;
    private String name;
    private String value;
    private String remark;

    @Id
    @Column(name = "seqid", nullable = false)
    public Long getSeqid() {
        return seqid;
    }

    public void setSeqid(Long seqid) {
        this.seqid = seqid;
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
    @Column(name = "name", nullable = true, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "value", nullable = false, length = 100)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
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
        PrivilegeEntity that = (PrivilegeEntity) o;
        return seqid == that.seqid &&
                Objects.equals ( type, that.type ) &&
                Objects.equals ( name, that.name ) &&
                Objects.equals ( value, that.value ) &&
                Objects.equals ( remark, that.remark );
    }

    @Override
    public int hashCode() {

        return Objects.hash ( seqid, type, name, value, remark );
    }
}
