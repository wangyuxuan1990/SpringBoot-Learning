package com.wangyuxuan;

import com.wangyuxuan.domain.User;
import com.wangyuxuan.domain.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Chapter322Application.class)
public class Chapter322ApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() throws Exception {
        userRepository.save(new User("wangyuxuan", 28));
        userRepository.save(new User("ethanwong", 30));

        Assert.assertEquals(2, userRepository.findAll().size());

        Assert.assertEquals(28, userRepository.findByName("wangyuxuan").getAge().intValue());

        Assert.assertEquals(28, userRepository.findUser("wangyuxuan").getAge().intValue());

        Assert.assertEquals("wangyuxuan", userRepository.findByNameAndAge("wangyuxuan", 28).getName());

        userRepository.delete(userRepository.findByName("ethanwong"));

        Assert.assertEquals(1, userRepository.findAll().size());

    }

}
