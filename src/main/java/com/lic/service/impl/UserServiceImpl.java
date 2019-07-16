package com.lic.service.impl;

import com.lic.mapper.UserMapper;
import com.lic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lichai
 * @date 17:56 2019/7/15
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public String getUser(int id) {
        return userMapper.getUser(id).toString();
    }
}
