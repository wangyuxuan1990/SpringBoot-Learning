package com.wangyuxuan;

import org.springframework.data.repository.CrudRepository;

import javax.naming.Name;

/**
 * @Auther: wangyuxuan
 * @Date: 2018/11/9 10:54
 * @Description:
 */
public interface PersonRepository extends CrudRepository<Person, Name> {
}
