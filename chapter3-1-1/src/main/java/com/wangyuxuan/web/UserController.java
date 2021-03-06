package com.wangyuxuan.web;

import com.wangyuxuan.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @Auther: wangyuxuan
 * @Date: 2018/10/26 14:35
 * @Description:
 */
@RestController
@RequestMapping(value = "/users")  //配置映射在/users在，可去除
public class UserController {

    // 创建线程安全的Map
    static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());

    /**
     *
     * 功能描述: 处理"/users/"的GET请求，用来获取用户列表
     * 还可以通过@RequestParam从页面中传递参数来进行查询条件或者翻页信息的传递
     * @param: []
     * @return: java.util.List<com.wangyuxuan.domain.User>
     * @auther: wangyuxuan
     * @date: 2018/10/26 14:48
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<User> getUserList(){
        List<User> r = new ArrayList<>(users.values());
        return r;
    }

    /**
     *
     * 功能描述: 处理"/users/"的POST请求，用来创建User
     * 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数
     * @param: [user]
     * @return: java.lang.String
     * @auther: wangyuxuan
     * @date: 2018/10/26 14:59
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String postUser(@ModelAttribute User user){
        users.put(user.getId(), user);
        return "success";
    }

    /**
     *
     * 功能描述: 处理"/users/{id}"的GET请求，用来获取url中id值的User信息
     * url中的id可通过@PathVariable绑定到函数的参数中
     * @param: [id]
     * @return: com.wangyuxuan.domain.User
     * @auther: wangyuxuan
     * @date: 2018/10/26 15:28
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable Long id){
        return users.get(id);
    }

    /**
     *
     * 功能描述: 处理"/users/{id}"的PUT请求，用来更新User信息
     *
     * @param: [id, user]
     * @return: java.lang.String
     * @auther: wangyuxuan
     * @date: 2018/10/26 15:36
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String putUser(@PathVariable Long id, @ModelAttribute User user){
        User u = users.get(id);
        u.setName(user.getName());
        u.setAge(user.getAge());
        users.put(id, u);
        return "success";
    }

    /**
     *
     * 功能描述: 处理"/users/{id}"的DELETE请求，用来删除User
     *
     * @param: [id]
     * @return: java.lang.String
     * @auther: wangyuxuan
     * @date: 2018/10/26 15:40
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long id){
        users.remove(id);
        return "success";
    }
}
