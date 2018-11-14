package com.wangyuxuan;

import com.wangyuxuan.async.Task;
import lombok.SneakyThrows;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter414ApplicationTests {

    @Autowired
    private Task task;

    @Test
    @SneakyThrows
    public void test() throws Exception {

        for (int i = 0; i < 10000; i++) {
            task.doTaskOne();
            task.doTaskTwo();
            task.doTaskThree();
            if (i == 9999) {
                System.exit(0);
            }
        }
    }

}
