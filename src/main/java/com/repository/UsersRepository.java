package com.repository;

import com.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description:
 * @author: Qiao.Jian
 * @create: 2018-09-21 16:29
 */
@Repository
public interface UsersRepository extends JpaRepository<UsersEntity, Long> {

    UsersEntity findOneByUserLogNoEquals(String userlogno);
    UsersEntity findBySeqId(Long seqid);

    @Query(value = "select * from users u join usersrole ur on u.userlogno=ur.username where ur.roleno=?1 and u.inuse=?2 and u.userlogno like ?3", nativeQuery = true)
    List<UsersEntity> findUsersByRoleNoAndNo(String roleno, int inuse, String userlogno);
}
