package com.wz.datamasking.demo.service;

import com.wz.datamasking.demo.entity.PageWrapper;
import com.wz.datamasking.demo.entity.PageWrapper2;
import com.wz.datamasking.demo.entity.ResultWrapper;
import com.wz.datamasking.demo.entity.ResultWrapper2;
import com.wz.datamasking.demo.entity.User;

public interface UserService {

    User userInfo();

    ResultWrapper<PageWrapper<User>> userPageList1();

    ResultWrapper2<PageWrapper2<User>> userPageList2();

    User userInfoMask();

    ResultWrapper<PageWrapper<User>> userPageList1Mask();

    ResultWrapper2<PageWrapper2<User>> userPageList2Mask();

}
