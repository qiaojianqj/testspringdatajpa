package com.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @description:
 * @author: Qiao.Jian
 * @create: 2018-09-20 19:10
 */
public class UsersroleEntityPK implements Serializable {
    private Long seqid;
    private String username;
    private String roleno;

    @Column(name = "seqid", nullable = false)
    @Id
    public Long getSeqid() {
        return seqid;
    }

    public void setSeqid(Long seqid) {
        this.seqid = seqid;
    }

    @Column(name = "username", nullable = false, length = 30)
    @Id
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "roleno", nullable = false, length = 20)
    @Id
    public String getRoleno() {
        return roleno;
    }

    public void setRoleno(String roleno) {
        this.roleno = roleno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;

        UsersroleEntityPK that = (UsersroleEntityPK) o;

        if (seqid != that.seqid) return false;
        if (username != null ? !username.equals ( that.username ) : that.username != null) return false;
        if (roleno != null ? !roleno.equals ( that.roleno ) : that.roleno != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (seqid ^ (seqid >>> 32));
        result = 31 * result + (username != null ? username.hashCode () : 0);
        result = 31 * result + (roleno != null ? roleno.hashCode () : 0);
        return result;
    }
}
