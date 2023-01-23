package io.binghe.shop.user.service;


import io.binghe.shop.bean.User;

public interface UserService {

    /**
     * 根据id获取用户信息
     */
    User getUserById(Long userId);
}