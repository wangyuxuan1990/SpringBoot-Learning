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

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Chapter327Application.class)
@Transactional
public class Chapter327ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    @Rollback
    public void findByName() throws Exception {
        userMapper.insert("wangyuxuan", 28);
        User user = userMapper.findByName("wangyuxuan");
        Assert.assertEquals(28, user.getAge().intValue());
    }

}
