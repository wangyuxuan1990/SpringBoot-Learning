package com.wangyuxuan.domain;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Auther: wangyuxuan
 * @Date: 2018/11/6 10:24
 * @Description:
 */
@CacheConfig(cacheNames = "users")
public interface UserRepository extends JpaRepository<User, Long> {

    @Cacheable(key = "#p0", condition = "#p0.length() < 15")
    User findByName(String name);

}
