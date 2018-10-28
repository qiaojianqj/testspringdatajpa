package com.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @description:
 * @author: Qiao.Jian
 * @create: 2018-09-20 19:10
 */
public class RoleEntityPK implements Serializable {
    private Long seqid;
    private String no;

    @Column(name = "seqid", nullable = false)
    @Id
    public Long getSeqid() {
        return seqid;
    }

    public void setSeqid(Long seqid) {
        this.seqid = seqid;
    }

    @Column(name = "no", nullable = false, length = 20)
    @Id
    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;

        RoleEntityPK that = (RoleEntityPK) o;

        if (seqid != that.seqid) return false;
        if (no != null ? !no.equals ( that.no ) : that.no != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (seqid ^ (seqid >>> 32));
        result = 31 * result + (no != null ? no.hashCode () : 0);
        return result;
    }
}
