package org.wz.datamasking.demo.controller;

import org.wz.datamasking.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wz.datamask.annotation.Masked;
import org.wz.datamasking.demo.entity.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Masked
    @GetMapping("/userInfo")
    public User userInfo() {
        return userService.userInfo();
    }

    @Masked(groups = {"myGroup", "myGroup2"})
//    @Masked(groups = {"myGroup2"})
//    @Masked
    @GetMapping("/userInfoGroupMask")
    public User userInfoGroupMask() {
        return userService.userInfo();
    }

    @Masked(value = "data.content")
    @GetMapping("/userPageList1")
    public ResultWrapper<PageWrapper<User>> userPageList1() {
        return userService.userPageList1();
    }

    @Masked
    @GetMapping("/userPageList2")
    public ResultWrapper2<PageWrapper2<User>> userPageList2() {
        return userService.userPageList2();
    }

    @GetMapping("/userInfoMaskOnService")
    public User userInfoMaskOnService() {
        return userService.userInfoMask();
    }

    @GetMapping("/userPageList1MaskOnService")
    public ResultWrapper<PageWrapper<User>> userPageList1MaskOnService() {
        return userService.userPageList1Mask();
    }

    @GetMapping("/userPageList2MaskOnService")
    public ResultWrapper2<PageWrapper2<User>> userPageList2MaskOnService() {
        return userService.userPageList2Mask();
    }

}
