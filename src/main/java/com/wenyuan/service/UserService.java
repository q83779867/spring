package com.wenyuan.service;

import com.wenyuan.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
* @author qww05
* @description 针对表【s_user】的数据库操作Service
* @createDate 2023-12-07 09:47:39
*/
public interface UserService extends IService<User> {

    //查询全部的员工信息
    List<User> userAll();

    //通过ID查询员工
    User userById(Long userId);

    //通过ID删除员工
    int userDelete(Long userId);

    //增加一个员工
    int userInsert(User user);

    //修改员工
    int userUpdate(User user);

    List<User> userLimit(Map<String,Integer>map);

}
