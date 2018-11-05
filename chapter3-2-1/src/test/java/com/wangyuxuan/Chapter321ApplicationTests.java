package com.wangyuxuan;

import com.wangyuxuan.service.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Chapter321Application.class)
public class Chapter321ApplicationTests {

    @Autowired
    private UserService userService;

    @Before
    public void setUp() {
        userService.deleteAllUsers();
    }

    @Test
    public void test() throws Exception {
        userService.create("wangyuxuan", 28);
        userService.create("ethanwong", 30);

        Assert.assertEquals(2, userService.getAllUsers().intValue());

        userService.deleteByName("ethanwong");

        Assert.assertEquals(1, userService.getAllUsers().intValue());

    }

}
