package com.imooc.service;

import com.imooc.entity.User;

/**
 * 用户服务
 * Created by tianzeyu on 2018/3/20.
 */
public interface IUserService {
    User findUserByName(String userName);
}
