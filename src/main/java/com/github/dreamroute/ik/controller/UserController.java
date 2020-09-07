package com.github.dreamroute.ik.controller;

import com.alibaba.fastjson.JSON;
import com.github.dreamroute.ik.entity.User;
import com.github.dreamroute.ik.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author w.dehai
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/selectById")
    public String selectById(Long id) {
        User user = userService.selectById(id);
        return JSON.toJSONString(user, true);
    }

}
