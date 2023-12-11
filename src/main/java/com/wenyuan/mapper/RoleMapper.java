package com.wenyuan.mapper;

import com.wenyuan.pojo.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wenyuan.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author qww05
* @description 针对表【s_role】的数据库操作Mapper
* @createDate 2023-12-07 09:47:39
* @Entity com.wenyuan.pojo.Role
*/
@Mapper
public interface RoleMapper extends BaseMapper<Role> {

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




