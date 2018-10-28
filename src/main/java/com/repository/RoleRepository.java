package com.repository;

import com.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description:
 * @author: Qiao.Jian
 * @create: 2018-09-20 19:12
 */
@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
    @Query(value = "select r.* from role r,usersrole ur where ur.username= ?1 and ur.roleno=r.no", nativeQuery = true)
    List<RoleEntity> findRoleByUserName(String username);

    @Query(value = "select * from role where no not in(select roleno from usersrole where username=?1)", nativeQuery = true)
    List<RoleEntity> findExcluedRoleByUserName(String username);

}
