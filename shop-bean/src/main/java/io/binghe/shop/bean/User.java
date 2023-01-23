package io.binghe.shop.bean;

import com.baomidou.mybatisplus.annotation.*;
import io.binghe.shop.utils.id.SnowFlakeFactory;
import io.binghe.shop.utils.psswd.PasswordUtils;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("t_user")
public class User implements Serializable {

    private static final long serialVersionUID = -7032479567987350240L;

    /**
     * 数据id
     */
    @TableId(value = "id", type = IdType.INPUT)
    @TableField(value = "id", fill = FieldFill.INSERT)
    private Long id;

    /**
     * 用户名
     */
    @TableField("t_username")
    private String username;

    /**
     * 密码
     */
    @TableField("t_password")
    private String password;

    /**
     * 手机号
     */
    @TableField("t_phone")
    private String phone;

    /**
     * 地址
     */
    @TableField("t_address")
    private String address;

   /* public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }*/

    public User(){
        this.id = SnowFlakeFactory.getSnowFlakeFromCache().nextId();
        //默认密码
        this.password = PasswordUtils.getPassword("123456");
    }

}