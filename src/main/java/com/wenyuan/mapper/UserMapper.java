package com.wenyuan.mapper;

import com.wenyuan.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;
import java.util.Map;

/**
* @author qww05
* @description 针对表【s_user】的数据库操作Mapper
* @createDate 2023-12-07 09:47:39
* @Entity com.wenyuan.pojo.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

    //查询全部的员工信息
    List<User> userAll();//返回一个user

    //通过ID查询员工
    User userById(Long userId); //返回user 参数long userid

    //通过ID删除员工
    int userDelete(Long userId);

    //增加一个员工
    int userInsert(User user);

    //修改员工
    int userUpdate(User user);
    //分页
    List<User> userLimit(Map<String,Integer> map);

    //查询所有用户信息 以及对应的角色信息
  //  List<User> users();



}




