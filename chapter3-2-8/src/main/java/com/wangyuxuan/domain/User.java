package com.wangyuxuan.domain;

import lombok.Data;

/**
 * @Auther: wangyuxuan
 * @Date: 2018/11/8 14:09
 * @Description:
 */
@Data
public class User {

    private Long id;
    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
