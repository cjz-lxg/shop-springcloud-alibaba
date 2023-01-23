package io.binghe.shop.user.service.impl;

import io.binghe.shop.bean.User;
import io.binghe.shop.user.mapper.UserMapper;
import io.binghe.shop.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Long userId) {
        return userMapper.selectById(userId);
    }
}