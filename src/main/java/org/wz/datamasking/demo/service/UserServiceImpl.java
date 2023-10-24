package org.wz.datamasking.demo.service;

import org.wz.datamasking.demo.entity.PageWrapper;
import org.wz.datamasking.demo.entity.PageWrapper2;
import org.wz.datamasking.demo.entity.ResultWrapper;
import org.wz.datamasking.demo.entity.ResultWrapper2;
import org.wz.datamasking.demo.entity.User;
import org.springframework.stereotype.Service;
import org.wz.datamask.annotation.Masked;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private User initUser() {
        User user = new User();
        user.setName("李大刀");
        user.setIdCard("426587966548523658");
        user.setFixedPhone("81818989");
        user.setMobilePhone("18879546582");
        user.setAddress("湖北省武汉市黄鹤楼一栋101");
        user.setEmail("testab@Gmail.com");
        user.setPassword("Wlsfk#$123");
        user.setCarLicense("京AD88888");
        user.setBankCard("6845987565214587");
        user.setIpv4("192.169.31.12");
        user.setIpv6("2001:470:c:1818::2");
        user.setUserName("user_name");
        return user;
    }

    @Override
    public User userInfo() {
        return initUser();
    }

    @Override
    public ResultWrapper<PageWrapper<User>> userPageList1() {
        User user = initUser();
        List<User> userList = new ArrayList<>();
        userList.add(user);
        return new ResultWrapper<>(0, "msg",new PageWrapper<User>(userList, userList.size()), true);
    }

    @Override
    public ResultWrapper2<PageWrapper2<User>> userPageList2() {
        User user = initUser();
        List<User> userList = new ArrayList<>();
        userList.add(user);
        return new ResultWrapper2<>(0, "msg",new PageWrapper2<User>(userList, userList.size()), true);
    }

    @Masked
    @Override
    public User userInfoMask() {
        return userInfo();
    }

    @Masked(value = "data.content")
    @Override
    public ResultWrapper<PageWrapper<User>> userPageList1Mask() {
        return userPageList1();
    }

    @Masked
    @Override
    public ResultWrapper2<PageWrapper2<User>> userPageList2Mask() {
        return userPageList2();
    }
}
