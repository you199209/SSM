package com.pretty.ssm.sys.service.impl;

import com.pretty.ssm.common.cache.RedisCache;
import com.pretty.ssm.common.page.Page;
import com.pretty.ssm.entity.User;
import com.pretty.ssm.sys.dao.UserDao;
import com.pretty.ssm.sys.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
	
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserDao userDao;
    @Autowired
    private RedisCache cache;

    @Override
    public User findUserById(String id) {


        return null;
    }

    @Override
    public List<User> findUsersByParams(User user) {
        String cache_key = RedisCache.CAHCENAME + "|findUsers";
        //先去缓存中取
        List<User> userList = cache.getListCache(cache_key, User.class);
        if(userList == null){
            //缓存中没有再去数据库取
            userList = userDao.queryAll(null);
            //插入缓存,时间60秒
            cache.putListCacheWithExpireTime(cache_key, userList, RedisCache.CAHCETIME);
        }else{
            LOG.info("get cache with key:"+cache_key);
        }
        return userList;
    }

    @Override
    public Page<User> findUsersByPage(Page<User> page) {
        List<User> list = userDao.queryAllByPage(page);
        if(list != null && list.size() > 0){
            page.setResults(list);
        }
        return page;
    }

}
