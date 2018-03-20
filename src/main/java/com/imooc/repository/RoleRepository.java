package com.imooc.repository;

import com.imooc.entity.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by tianzeyu on 2018/3/20.
 */
public interface RoleRepository extends CrudRepository<Role, Long> {
    List<Role> findRolesByUserId(Long userId);
}
