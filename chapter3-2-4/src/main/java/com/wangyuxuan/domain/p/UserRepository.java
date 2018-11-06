package com.wangyuxuan.domain.p;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @Auther: wangyuxuan
 * @Date: 2018/11/6 10:24
 * @Description:
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
