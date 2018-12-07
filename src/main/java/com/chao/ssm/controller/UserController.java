package com.chao.ssm.controller;

import com.chao.ssm.bean.UserDO;
import com.chao.ssm.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/selectById")
    public UserDO selectById() {
        return userMapper.selectById("0000");
    }

}
