package com.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/**
 * @description:
 * @author: Qiao.Jian
 * @create: 2018-09-21 15:00
 */
public class RoleprivilegeEntityPK implements Serializable {
    private long seqid;
    private String roleno;
    private long privilegeid;

    @Column(name = "seqid", nullable = false)
    @Id
    public long getSeqid() {
        return seqid;
    }

    public void setSeqid(long seqid) {
        this.seqid = seqid;
    }

    @Column(name = "roleno", nullable = false, length = 20)
    @Id
    public String getRoleno() {
        return roleno;
    }

    public void setRoleno(String roleno) {
        this.roleno = roleno;
    }

    @Column(name = "privilegeid", nullable = false)
    @Id
    public long getPrivilegeid() {
        return privilegeid;
    }

    public void setPrivilegeid(long privilegeid) {
        this.privilegeid = privilegeid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        RoleprivilegeEntityPK that = (RoleprivilegeEntityPK) o;
        return seqid == that.seqid &&
                privilegeid == that.privilegeid &&
                Objects.equals ( roleno, that.roleno );
    }

    @Override
    public int hashCode() {

        return Objects.hash ( seqid, roleno, privilegeid );
    }
}
