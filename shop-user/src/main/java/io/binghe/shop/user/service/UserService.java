package io.binghe.shop.user.service;


import io.binghe.shop.bean.User;

public interface UserService {

    void asyncMethod();


    /**
     * 根据id获取用户信息
     */
    User getUserById(Long userId);
}