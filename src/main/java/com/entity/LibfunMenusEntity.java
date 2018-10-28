package com.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @description:
 * @author: Qiao.Jian
 * @create: 2018-09-21 17:37
 */
@Entity
@Table(name = "libfun_menus", schema = "scgame", catalog = "")
public class LibfunMenusEntity {
    private Long seqId;
    private String menuNo;
    private String menuName;
    private String pMenuNo;
    private String menuUrl;
    private Integer displayOrder;
    private Short inUse;

    @Id
    @Column(name = "SeqId", nullable = false)
    public Long getSeqId() {
        return seqId;
    }

    public void setSeqId(Long seqId) {
        this.seqId = seqId;
    }

    @Basic
    @Column(name = "MenuNo", nullable = true, length = 20)
    public String getMenuNo() {
        return menuNo;
    }

    public void setMenuNo(String menuNo) {
        this.menuNo = menuNo;
    }

    @Basic
    @Column(name = "MenuName", nullable = false, length = 30)
    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    @Basic
    @Column(name = "PMenuNo", nullable = false, length = 20)
    public String getpMenuNo() {
        return pMenuNo;
    }

    public void setpMenuNo(String pMenuNo) {
        this.pMenuNo = pMenuNo;
    }

    @Basic
    @Column(name = "MenuUrl", nullable = false, length = 200)
    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    @Basic
    @Column(name = "DisplayOrder", nullable = false)
    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    @Basic
    @Column(name = "InUse", nullable = false)
    public Short getInUse() {
        return inUse;
    }

    public void setInUse(Short inUse) {
        this.inUse = inUse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        LibfunMenusEntity that = (LibfunMenusEntity) o;
        return seqId == that.seqId &&
                displayOrder == that.displayOrder &&
                inUse == that.inUse &&
                Objects.equals ( menuNo, that.menuNo ) &&
                Objects.equals ( menuName, that.menuName ) &&
                Objects.equals ( pMenuNo, that.pMenuNo ) &&
                Objects.equals ( menuUrl, that.menuUrl );
    }

    @Override
    public int hashCode() {

        return Objects.hash ( seqId, menuNo, menuName, pMenuNo, menuUrl, displayOrder, inUse );
    }
}
