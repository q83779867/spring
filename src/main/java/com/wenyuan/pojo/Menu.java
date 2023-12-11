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
 * @TableName s_menu
 */
@TableName(value ="s_menu")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu implements Serializable {
    /**
     * 权限id
     */
    @TableId(value = "menu_id")
    private Long menuId;

    /**
     * 权限名
     */
    @TableField(value = "menu_name")
    private String menuName;

    /**
     * 排序
     */
    @TableField(value = "sort")
    private Integer sort;

    /**
     * 是否启用
     */
    @TableField(value = "is_enabled")
    private Integer isEnabled;

    /**
     * 权限功能描述
     */
    @TableField(value = "description")
    private String description;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}