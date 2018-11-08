package com.wangyuxuan;

import com.wangyuxuan.domain.User;
import com.wangyuxuan.domain.UserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Chapter326Application.class)
public class Chapter326ApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Before
    public void setUp(){
        userRepository.deleteAll();
    }

    @Test
    public void test() throws Exception {
        userRepository.save(new User(1L,"wangyuxuan",28));
        userRepository.save(new User(2L,"ethanwong",30));
        Assert.assertEquals(2, userRepository.findAll().size());

        User user = userRepository.findOne(1L);
        userRepository.delete(user);
        Assert.assertEquals(1, userRepository.findAll().size());

        user = userRepository.findByUsername("ethanwong");
        userRepository.delete(user);
        Assert.assertEquals(0, userRepository.findAll().size());
    }

}
