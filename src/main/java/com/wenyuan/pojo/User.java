package com.wenyuan.pojo;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @TableName s_user
 */
@TableName(value ="s_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    /**
     * 用户id
     */
    @TableId(value = "user_id")
    private Long userId;

    /**
     * 用户名
     */
    @TableField(value = "user_name")
    private String userName;

    /**
     * 密码
     */
    @TableField(value = "password")
    private String password;

    /**
     * 用户状态
     */
    @TableField(value = "state")
    private Integer state;

    /**
     * 用户类型
     */
    @TableField(value = "user_type")
    private String userType;


    private Role role;


    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}