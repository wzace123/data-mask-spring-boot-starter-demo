package com.wz.datamasking.demo.controller;

import com.wz.datamasking.demo.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wz.datamask.annotation.Masked;

@RestController
@RequestMapping("/user")
public class UserController {

    @Masked
    @GetMapping("/info")
    public User getUserInfo() {
        User user = new User();
        user.setAddress("湖北省武汉市青山区123街坊100号");
        user.setName("德玛");
        user.setIdCard("42150566556133");
        user.setMobile("12345687911");
        return user;
    }

}
