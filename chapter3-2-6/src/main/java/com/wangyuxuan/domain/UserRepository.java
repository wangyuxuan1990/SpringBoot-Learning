package com.wangyuxuan.domain;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @Auther: wangyuxuan
 * @Date: 2018/11/8 10:54
 * @Description:
 */
public interface UserRepository extends MongoRepository<User, Long> {

    User findByUsername(String username);
}
