package com.wangyuxuan.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

/**
 * @Auther: wangyuxuan
 * @Date: 2018/11/8 10:49
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private Long id;

    private String username;
    private Integer age;
}
