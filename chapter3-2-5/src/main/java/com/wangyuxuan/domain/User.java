package com.wangyuxuan.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Auther: wangyuxuan
 * @Date: 2018/11/7 15:03
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = -1915191088258867340L;

    private String username;
    private Integer age;
}
