package com.repository;

import com.entity.UsersroleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description:
 * @author: Qiao.Jian
 * @create: 2018-09-20 19:13
 */

@Repository
public interface UsersroleRepository extends JpaRepository<UsersroleEntity, Long>, JpaSpecificationExecutor<UsersroleEntity> {
    //传入参数不能为null
    @Query(value = "select * from usersrole a left join role b on a.roleno=b.no where a.username=?1 and b.remark=?2", nativeQuery = true )
    List<UsersroleEntity> findBy(String username, String remark);
}
