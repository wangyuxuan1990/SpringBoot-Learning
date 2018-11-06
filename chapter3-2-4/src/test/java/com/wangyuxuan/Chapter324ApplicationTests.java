package com.wangyuxuan;

import com.wangyuxuan.domain.p.User;
import com.wangyuxuan.domain.p.UserRepository;
import com.wangyuxuan.domain.s.Message;
import com.wangyuxuan.domain.s.MessageRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Chapter324Application.class)
public class Chapter324ApplicationTests {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private MessageRepository messageRepository;

    @Test
    public void test() throws Exception {
        userRepository.save(new User("wangyuxuan", 28));
        userRepository.save(new User("ethanwong", 30));

        Assert.assertEquals(2, userRepository.findAll().size());

        messageRepository.save(new Message("wangyuxuan", "SpringBoot-Learn"));

        Assert.assertEquals(1, messageRepository.findAll().size());

    }

}
