package com.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @description:
 * @author: Qiao.Jian
 * @create: 2018-09-21 19:38
 */
@Entity
@Table(name = "libclassm", schema = "scgame", catalog = "")
public class LibclassmEntity {
    private Long seqId;
    private String classNo;
    private String className;
    private String remark;

    @Id
    @Column(name = "SeqId", nullable = false)
    public Long getSeqId() {
        return seqId;
    }

    public void setSeqId(Long seqId) {
        this.seqId = seqId;
    }

    @Basic
    @Column(name = "ClassNo", nullable = false, length = 20)
    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    @Basic
    @Column(name = "ClassName", nullable = false, length = 40)
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Basic
    @Column(name = "Remark", nullable = true, length = 255)
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
        LibclassmEntity that = (LibclassmEntity) o;
        return seqId == that.seqId &&
                Objects.equals ( classNo, that.classNo ) &&
                Objects.equals ( className, that.className ) &&
                Objects.equals ( remark, that.remark );
    }

    @Override
    public int hashCode() {

        return Objects.hash ( seqId, classNo, className, remark );
    }
}
