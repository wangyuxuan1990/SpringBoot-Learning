package com.wangyuxuan;

import com.wangyuxuan.rabbit.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Chapter521Application.class)
public class Chapter521ApplicationTests {

    @Autowired
    private Sender sender;

    @Test
    public void test() throws Exception {
        sender.send();
    }

}
