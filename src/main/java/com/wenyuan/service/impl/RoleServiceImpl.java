package com.wenyuan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wenyuan.pojo.Role;
import com.wenyuan.service.RoleService;
import com.wenyuan.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author qww05
* @description 针对表【s_role】的数据库操作Service实现
* @createDate 2023-12-07 09:47:39
*/
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role>
    implements RoleService{

    @Autowired
    RoleMapper roleMapper;

    @Override
    public List<Role> roleAll() {
        return roleMapper.roleAll();
    }

    @Override
    public Role roleById(Long roleId) {
        return roleMapper.roleById(roleId);
    }

    @Override
    public int roleDelete(Long roleId) {
        return roleMapper.roleDelete(roleId);
    }

    @Override
    public int roleInsert(Role role) {
        return roleMapper.roleInsert(role);
    }

    @Override
    public int roleUpdate(Role role) {
        return roleMapper.roleUpdate(role);
    }
}




