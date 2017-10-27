package com.pretty.ssm.sys.dao;

import com.pretty.ssm.common.page.Page;
import com.pretty.ssm.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserDao {

	/**
     * 根据用户id查询用户对象
     */
   public User queryByParams(String id);
    
    /**
     * 查询用户列表
     *
     */
   public List<User> queryAll(User user);

    /**
     * 分页查询用户列表
     *
     */
    public List<User> queryAllByPage(Page<User> page);
	
}
