package com.wenyuan.service;

import com.wenyuan.pojo.Role;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author qww05
* @description 针对表【s_role】的数据库操作Service
* @createDate 2023-12-07 09:47:39
*/
public interface RoleService extends IService<Role> {

    //查询全部的角色信息
    List<Role> roleAll();

    //通过ID查询角色
    Role roleById(Long roleId);

    //通过ID删除角色
    int roleDelete(Long roleId);

    //增加一个角色
    int roleInsert(Role role);

    //修改角色
    int roleUpdate(Role role);
}
