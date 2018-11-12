package com.wangyuxuan.service;

import com.wangyuxuan.domain.User;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Auther: wangyuxuan
 * @Date: 2018/11/12 19:49
 * @Description:
 */
public interface UserService {

    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
    User login(String name, String password);
}
