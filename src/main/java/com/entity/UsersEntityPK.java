package com.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/**
 * @description:
 * @author: Qiao.Jian
 * @create: 2018-09-21 16:28
 */
public class UsersEntityPK implements Serializable {
    private long seqId;
    private String userLogNo;

    @Column(name = "SeqId", nullable = false)
    @Id
    public long getSeqId() {
        return seqId;
    }

    public void setSeqId(long seqId) {
        this.seqId = seqId;
    }

    @Column(name = "UserLogNo", nullable = false, length = 30)
    @Id
    public String getUserLogNo() {
        return userLogNo;
    }

    public void setUserLogNo(String userLogNo) {
        this.userLogNo = userLogNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        UsersEntityPK that = (UsersEntityPK) o;
        return seqId == that.seqId &&
                Objects.equals ( userLogNo, that.userLogNo );
    }

    @Override
    public int hashCode() {

        return Objects.hash ( seqId, userLogNo );
    }
}
