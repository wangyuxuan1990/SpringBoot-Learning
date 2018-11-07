package com.wangyuxuan;

import com.wangyuxuan.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Chapter325Application.class)
public class Chapter325ApplicationTests {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate<String, User> redisTemplate;

    @Test
    public void test() throws Exception {
        //保存字符串
        stringRedisTemplate.opsForValue().set("wyx","SpringBoot-Learn");
        Assert.assertEquals("SpringBoot-Learn", stringRedisTemplate.opsForValue().get("wyx"));

        //保存对象
        User user = new User("wangyuxuan", 28);
        redisTemplate.opsForValue().set(user.getUsername(), user);
        user = new User("ethanwong", 30);
        redisTemplate.opsForValue().set(user.getUsername(), user);
        Assert.assertEquals(28, redisTemplate.opsForValue().get("wangyuxuan").getAge().longValue());
        Assert.assertEquals(30, redisTemplate.opsForValue().get("ethanwong").getAge().longValue());
    }

}
