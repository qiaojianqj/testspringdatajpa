package com.controller;

import com.entity.*;
import com.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Qiao.Jian
 * @create: 2018-09-20 19:25
 */

@RestController
@RequestMapping("/")
public class DaoController {
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private UsersroleRepository usersroleRepository;
    @Autowired
    private PrivilegeRepository privilegeRepository;
    @Autowired
    private RoleprivilegeRepository roleprivilegeRepository;
    @Autowired
    private UsersRepository usersRepository;
    @Autowired
    private LibfunMenusRepository libfunMenusRepository;
    @Autowired
    private LibclassmRepository libclassmRepository;

    @RequestMapping("/query")
    String query() {
       System.out.println ( "received query http request" );
       //List<RoleEntity> roleEntityList = roleRepository.findAll ();
       // for (RoleEntity role: roleEntityList
       //      ) {
       //    System.out.println ( role.getName () + "---" + role.getNo () );
       // }

        //List<UsersroleEntity> usersroleEntityList = usersroleRepository.findBy ( "qiaojian", "jpa" );
        //List<UsersroleEntity> usersroleEntityList = getUsersrole();
        //for (UsersroleEntity user: usersroleEntityList
        //      ) {
        //    System.out.println ( user.getUsername () + "---" + user.getRoleno () );
        // }

        //List<PrivilegeEntity> privilegeEntityList = privilegeRepository.getUserPrivilegeByType ( "qiaojian", 1);
        //for (PrivilegeEntity privilege: privilegeEntityList
        //     ) {
        //   System.out.println ( privilege.getName () + "---" + privilege.getValue () );
        //}
        //RoleprivilegeEntity roleprivilegeEntity1 = new RoleprivilegeEntity ();
        //roleprivilegeEntity1.setSeqid ( 1234L );
        //roleprivilegeEntity1.setRoleno ( "sysmanage" );
        //roleprivilegeEntity1.setPrivilegeid ( 302L);
        //RoleprivilegeEntity roleprivilegeEntity2 = new RoleprivilegeEntity ();
        //roleprivilegeEntity2.setSeqid ( 1235L );
        //roleprivilegeEntity2.setRoleno ( "sysmanage" );
        //roleprivilegeEntity2.setPrivilegeid ( 302L );
        //List<RoleprivilegeEntity> roleprivilegeEntityList = new ArrayList<> (  );
        //roleprivilegeEntityList.add ( roleprivilegeEntity1 );
        //roleprivilegeEntityList.add ( roleprivilegeEntity2 );
        //roleprivilegeRepository.saveAll ( roleprivilegeEntityList );
        //roleprivilegeRepository.deleteInBatch (roleprivilegeEntityList);


        //List<RoleEntity> roleEntityList = roleRepository.findExcluedRoleByUserName ( "qiaojian" );
        //for (RoleEntity role: roleEntityList
        //      ) {
        //    System.out.println ( role.getName () + "---" + role.getNo () );
        // }

        //UsersEntity user = usersRepository.findBySeqId (3309L);
        //System.out.println ( user.getSeqId () + "---" + user.getUserLogNo () + "---" + user.getTrueName () );

        //List<String> menunolist = new ArrayList<> (  );
        //menunolist.add ( "2" );
        //menunolist.add ( "3" );
        //menunolist.add ( "4" );
        //menunolist.add ( "5" );
        //menunolist.add ( "6" );
        List<LibfunMenusEntity> libfunMenusEntityList= libfunMenusRepository.findByPMenuNoOrderByDisplayOrderAsc ( "1" );
        for (LibfunMenusEntity menu: libfunMenusEntityList
             ) {
            System.out.println ( menu.getMenuNo () + "***" + menu.getMenuName () + "***" + menu.getDisplayOrder () );
        }

        //List<LibclassmEntity> libclassmEntityList = libclassmRepository.findAll ();
        //for (LibclassmEntity classm: libclassmEntityList
        //     ) {
        //   System.out.println ( classm.getClassNo () + "---" + classm.getClassName ());
        //}

        //LibfunMenusEntity menu = libfunMenusRepository.findFirstByOrderBySeqIdDesc ();
        //System.out.println ( menu.getMenuNo () + "***" + menu.getMenuName () + "***" + menu.getDisplayOrder () );
         return "OK!";
    }

    public List<UsersroleEntity> getUsersrole() {
        Specification<UsersroleEntity> specification = new Specification<UsersroleEntity> () {
            @Override
            public Predicate toPredicate(Root<UsersroleEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> predicatesList = new ArrayList<> (  );

                //Join<UsersroleEntity, RoleEntity> joinRole = root.join ( root.getModel ().getSingularAttribute ( "refrole", RoleEntity.class ), JoinType.LEFT );

                //Predicate predicateRemark = criteriaBuilder.equal ( joinRole.get ( "remark" ), "jpa" );
                Predicate predicateUsername = criteriaBuilder.equal ( root.get ( "username" ), "qiaojian" );

                //Predicate predicateAnd = criteriaBuilder.and ( predicateUsername, predicateRemark );

                //predicatesList.add ( predicateAnd );
                predicatesList.add ( predicateUsername );

                Predicate[] predicates = new Predicate[predicatesList.size ()];
                return criteriaBuilder.and ( predicatesList.toArray ( predicates ) );
            }
        };
        return usersroleRepository.findAll (specification);
    }
}
