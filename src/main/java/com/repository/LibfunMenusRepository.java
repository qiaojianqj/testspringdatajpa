package com.repository;

import com.entity.LibfunMenusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description:
 * @author: Qiao.Jian
 * @create: 2018-09-21 17:38
 */
@Repository
public interface LibfunMenusRepository extends JpaRepository<LibfunMenusEntity, Long>{
    List<LibfunMenusEntity> findByInUseOrderByDisplayOrderAsc(short inuse);
    List<LibfunMenusEntity> findByInUseAndMenuNoInOrderByDisplayOrderAsc(short inuse, List<String> menunolist);
    LibfunMenusEntity findFirstByOrderBySeqIdDesc();
    List<LibfunMenusEntity> findByPMenuNoOrderByDisplayOrderAsc(String pmenuno);
    List<LibfunMenusEntity> findByOrderByDisplayOrderAsc();
}
