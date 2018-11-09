package com.wangyuxuan;

import lombok.Data;
import org.springframework.ldap.odm.annotations.*;

import javax.naming.Name;

/**
 * @Auther: wangyuxuan
 * @Date: 2018/11/9 10:47
 * @Description:
 */
@Entry(base = "ou=people,dc=wangyuxuan,dc=com", objectClasses = "inetOrgPerson")
@Data
public class Person {

    @Id
    private Name id;
    @DnAttribute(value = "uid", index = 3)
    private String uid;
    @Attribute(name = "cn")
    private String commonName;
    @Attribute(name = "sn")
    private String suerName;
    private String userPassword;

}
