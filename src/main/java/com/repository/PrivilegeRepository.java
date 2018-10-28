package com.repository;

import com.entity.PrivilegeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description:
 * @author: Qiao.Jian
 * @create: 2018-09-21 15:01
 */
@Repository
public interface PrivilegeRepository extends JpaRepository<PrivilegeEntity, Long>{
    @Query(value = "select p.* from privilege p,roleprivilege rp where rp.roleno= ?1 and rp.privilegeid=p.seqid", nativeQuery = true)
    List<PrivilegeEntity> findBy(String roleNo);

    @Query(value = "select * from privilege where seqid not in(select privilegeid from roleprivilege where roleno=?1)", nativeQuery = true)
    List<PrivilegeEntity> findExcludeBy(String roleNo);


    @Query(value = "select p.* from usersrole ur,roleprivilege rp,privilege p where ur.username=?1 and ur.roleno=rp.roleno and rp.privilegeid=p.seqid and p.type=?2", nativeQuery = true)
    List<PrivilegeEntity> getUserPrivilegeByType(String username, int type);

}
