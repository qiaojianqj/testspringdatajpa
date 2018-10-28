package com.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * @description:
 * @author: Qiao.Jian
 * @create: 2018-09-20 19:10
 */
@Entity
@Table(name = "usersrole", schema = "scgame", catalog = "")
@IdClass(UsersroleEntityPK.class)
public class UsersroleEntity {
    private Long seqid;
    private String username;
    private String roleno;

    @OneToOne
    @JoinColumn(name = "roleno")
    private RoleEntity refrole;

    @Id
    @Column(name = "seqid", nullable = false)
    public Long getSeqid() {
        return seqid;
    }

    public void setSeqid(Long seqid) {
        this.seqid = seqid;
    }

    @Id
    @Column(name = "username", nullable = false, length = 30)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Id
    @Column(name = "roleno", nullable = false, length = 20)
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

        UsersroleEntity that = (UsersroleEntity) o;

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
