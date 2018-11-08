package com.wangyuxuan;

import com.wangyuxuan.domain.User;
import com.wangyuxuan.domain.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Chapter328Application.class)
@Transactional
public class Chapter328ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    @Rollback
    public void testUserMapper() throws Exception {
        userMapper.insert("wangyuxuan", 28);
        User user = userMapper.findByName("wangyuxuan");
        Assert.assertEquals(28, user.getAge().intValue());

        user.setAge(30);
        userMapper.update(user);
        user = userMapper.findByName("wangyuxuan");
        Assert.assertEquals(30, user.getAge().intValue());

        userMapper.delete(user.getId());
        user = userMapper.findByName("wangyuxuan");
        Assert.assertEquals(null, user);

        user = new User("ethanwong", 30);
        userMapper.insertByUser(user);
        Assert.assertEquals(30, userMapper.findByName("ethanwong").getAge().intValue());

        Map<String, Object> map = new HashMap<>();
        map.put("name","wangyuxuan");
        map.put("age",28);
        userMapper.insertByMap(map);
        Assert.assertEquals(28, userMapper.findByName("wangyuxuan").getAge().intValue());

        List<User> userList = userMapper.findAll();
        for (User u : userList){
            Assert.assertEquals(null,u.getId());
            Assert.assertNotEquals(null,u.getName());
        }

    }

}
