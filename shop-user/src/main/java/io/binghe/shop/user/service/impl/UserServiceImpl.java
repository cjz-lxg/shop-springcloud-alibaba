package io.binghe.shop.user.service.impl;

import io.binghe.shop.bean.User;
import io.binghe.shop.user.mapper.UserMapper;
import io.binghe.shop.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Async
    @Override
    public void asyncMethod() {
        log.info("执行了异步任务...");
    }

    @Override
    public User getUserById(Long userId) {
        return userMapper.selectById(userId);
    }
}