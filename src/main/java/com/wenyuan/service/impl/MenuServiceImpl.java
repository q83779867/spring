package com.wenyuan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wenyuan.pojo.Menu;
import com.wenyuan.service.MenuService;
import com.wenyuan.mapper.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author qww05
* @description 针对表【s_menu】的数据库操作Service实现
* @createDate 2023-12-07 09:47:39
*/
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu>
    implements MenuService{

    @Autowired
    MenuMapper menuMapper;

    @Override
    public List<Menu> menuAll() {
        return menuMapper.menuAll();
    }

    @Override
    public Menu menuById(Long menuId) {
        return menuMapper.menuById(menuId);
    }

    @Override
    public int menuDelete(Long menuId) {
        return menuMapper.menuDelete(menuId);
    }

    @Override
    public int menuInsert(Menu menu) {
        return menuMapper.menuInsert(menu);
    }

    @Override
    public int menuUpdate(Menu menu) {
        return menuMapper.menuUpdate(menu);
    }
}




