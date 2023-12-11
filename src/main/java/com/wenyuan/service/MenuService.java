package com.wenyuan.service;

import com.wenyuan.pojo.Menu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author qww05
* @description 针对表【s_menu】的数据库操作Service
* @createDate 2023-12-07 09:47:39
*/
public interface MenuService extends IService<Menu> {

    //查询全部的权限信息
    List<Menu> menuAll();

    //通过ID查询权限
    Menu menuById(Long menuId);

    //通过ID删除权限
    int menuDelete(Long menuId);

    //增加一个权限
    int menuInsert(Menu menu);

    //修改权限
    int menuUpdate(Menu menu);

}
