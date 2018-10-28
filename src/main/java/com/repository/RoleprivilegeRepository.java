package com.repository;

import com.entity.RoleprivilegeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @description:
 * @author: Qiao.Jian
 * @create: 2018-09-21 15:02
 */
@Repository
public interface RoleprivilegeRepository extends JpaRepository<RoleprivilegeEntity, Long> {

}
