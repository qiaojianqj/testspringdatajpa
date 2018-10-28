package com.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @description:
 * @author: Qiao.Jian
 * @create: 2018-09-21 15:00
 */
@Entity
@Table(name = "roleprivilege", schema = "scgame", catalog = "")
@IdClass(RoleprivilegeEntityPK.class)
public class RoleprivilegeEntity {
    private Long seqid;
    private String roleno;
    private Long privilegeid;

    @Id
    @Column(name = "seqid", nullable = false)
    public Long getSeqid() {
        return seqid;
    }

    public void setSeqid(Long seqid) {
        this.seqid = seqid;
    }

    @Id
    @Column(name = "roleno", nullable = false, length = 20)
    public String getRoleno() {
        return roleno;
    }

    public void setRoleno(String roleno) {
        this.roleno = roleno;
    }

    @Id
    @Column(name = "privilegeid", nullable = false)
    public Long getPrivilegeid() {
        return privilegeid;
    }

    public void setPrivilegeid(Long privilegeid) {
        this.privilegeid = privilegeid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        RoleprivilegeEntity that = (RoleprivilegeEntity) o;
        return seqid == that.seqid &&
                privilegeid == that.privilegeid &&
                Objects.equals ( roleno, that.roleno );
    }

    @Override
    public int hashCode() {

        return Objects.hash ( seqid, roleno, privilegeid );
    }
}
