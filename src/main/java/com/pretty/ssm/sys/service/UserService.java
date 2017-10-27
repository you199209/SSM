package com.pretty.ssm.sys.service;

import com.pretty.ssm.common.page.Page;
import com.pretty.ssm.entity.User;

import java.util.List;

public interface UserService {

    /**
     * 根据用户id查询用户对象
     */
    public User findUserById(String id);

    /**
     * 查询用户列表
     * 有缓存
     *
     */
    public List<User> findUsersByParams(User user);

    /**
     * 分页查询用户列表
     */
    public Page<User> findUsersByPage(Page<User> page);

}
