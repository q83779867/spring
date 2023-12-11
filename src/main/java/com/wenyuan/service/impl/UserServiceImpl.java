package com.wenyuan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wenyuan.pojo.User;
import com.wenyuan.service.UserService;
import com.wenyuan.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
* @author qww05
* @description 针对表【s_user】的数据库操作Service实现
* @createDate 2023-12-07 09:47:39
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> userAll() {
        return userMapper.userAll();
    }

    @Override
    public User userById(Long userId) {
        return userMapper.userById(userId);
    }

    @Override
    public int userDelete(Long userId) {
        return userMapper.userDelete(userId);
    }

    @Override
    public int userInsert(User user) {
        return userMapper.userInsert(user);
    }

    @Override
    public int userUpdate(User user) {
        return userMapper.userUpdate(user);
    }

    @Override
    public List<User> userLimit(Map<String, Integer> map) {
        return userMapper.userLimit(map);
    }
}




