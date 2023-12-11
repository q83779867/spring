package com.wenyuan.mapper;

import com.wenyuan.pojo.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wenyuan.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author qww05
* @description 针对表【s_menu】的数据库操作Mapper
* @createDate 2023-12-07 09:47:39
* @Entity com.wenyuan.pojo.Menu
*/
@Mapper
public interface MenuMapper extends BaseMapper<Menu> {

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




