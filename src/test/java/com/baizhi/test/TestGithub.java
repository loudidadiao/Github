package com.baizhi.test;

import com.baizhi.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestGithub {
    @Test
    public void test1(){
        System.out.println("这是写的第一行代码");
       System.out.println("这是写的第二行代码");
        System.out.println("这是第三行代码");
        System.out.println("这是第4行代码");
        System.out.println("这是第5行代码");
        System.out.println("这是第6行代码");

    }
}
