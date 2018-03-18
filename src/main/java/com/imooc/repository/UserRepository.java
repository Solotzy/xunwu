package com.imooc.repository;

import com.imooc.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by tianzeyu on 2018/3/18.
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
