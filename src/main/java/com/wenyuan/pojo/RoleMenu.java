package com.wenyuan.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @TableName s_role_menu
 */
@TableName(value ="s_role_menu")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleMenu implements Serializable {
    /**
     * 角色权限id
     */
    @TableId(value = "rmid")
    private String rmid;

    /**
     * 角色id
     */
    @TableField(value = "role_id")
    private Long roleId;

    /**
     * 权限id
     */
    @TableField(value = "menu_id")
    private Long menuId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}