package com.repository;

import com.entity.LibclassmEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @description:
 * @author: Qiao.Jian
 * @create: 2018-09-21 19:39
 */
@Repository
public interface LibclassmRepository extends JpaRepository<LibclassmEntity, Long>{
}
