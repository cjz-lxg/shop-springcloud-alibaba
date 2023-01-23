package io.binghe.shop.utils.psswd;

import io.binghe.shop.utils.md5.MD5Hash;

/**
 * @author binghe
 * @version 1.0.0
 * @description 密码工具类
 */
public class PasswordUtils {

    public static String getPassword(String password){
        if (password == null || password.trim().isEmpty()) return password;
        for (int i = 0; i < 5; i++){
            password = MD5Hash.md5Java(password);
        }
        return password;
    }
}
