package com.wenyuan.controller;

import com.wenyuan.pojo.Role;
import com.wenyuan.pojo.User;
import com.wenyuan.service.RoleService;
import com.wenyuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    RoleService roleService;//private final

    @Autowired
    UserService userService;

    public UserController(RoleService roleService,UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

//查询全部员工
    @RequestMapping("/emps")
    public String list(Model model) {
        List<User> users = userService.userAll();
        model.addAttribute("emps", users);
        return "emp/list";
    }

    @GetMapping("/emp")
    public String toAdd(Model model) {
        //查出部门的所有信息
        List<Role> roles = roleService.roleAll();
        model.addAttribute("roles", roles);
        return "emp/add";
    }

    @PostMapping("/emp")
    public String add(User user) {
        System.out.println("save=>"+user);
        //添加的操作
        userService.userInsert(user);
        return "redirect:/emps";//redirect:/emps
    }

    //去员工的修改页面
    @GetMapping("/update/{id}") //这里有id 下面跟一个@PathVariable     给前端返回数据用model
    public String toUpdateEmp(Long userId, Model model) {
        //查出原来的数据
        User user = userService.userById(userId);
        model.addAttribute("emp",user );

        List<Role> roles = roleService.roleAll();
        model.addAttribute("role" , roles);

        return "emp/update";
    }

    @PostMapping("/updateEmp")
    public String UpdateEmp(User user) {
        userService.userUpdate(user);
        return "redirect:/emps";
    }

    //删除员工
    @GetMapping("/delemp/{id}")
    public String deleteEmp(Long userId) {
        userService.userDelete(userId);
        return "redirect:/emps";
    }
}
