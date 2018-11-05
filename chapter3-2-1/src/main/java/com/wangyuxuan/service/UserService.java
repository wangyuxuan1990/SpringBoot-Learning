package com.wangyuxuan.service;

/**
 * @Auther: wangyuxuan
 * @Date: 2018/11/5 19:47
 * @Description:
 */
public interface UserService {

    /**
     *
     * 功能描述: 新增一个用户
     *
     * @param: [name, age]
     * @return: void
     * @auther: wangyuxuan
     * @date: 2018/11/5 19:48
     */
    void create(String name, Integer age);

    /**
     *
     * 功能描述: 根据name删除一个用户高
     *
     * @param: [name]
     * @return: void
     * @auther: wangyuxuan
     * @date: 2018/11/5 19:48
     */
    void deleteByName(String name);

    /**
     *
     * 功能描述: 获取用户总量
     *
     * @param: []
     * @return: java.lang.Integer
     * @auther: wangyuxuan
     * @date: 2018/11/5 19:49
     */
    Integer getAllUsers();

    /**
     *
     * 功能描述: 删除所有用户
     *
     * @param: []
     * @return: void
     * @auther: wangyuxuan
     * @date: 2018/11/5 19:49
     */
    void deleteAllUsers();
}
