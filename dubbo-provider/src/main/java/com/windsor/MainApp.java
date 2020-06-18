package com.windsor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * provider
 *
 * @author: fangwc
 * @date: 2020/6/18 20:58
 */
public class MainApp {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        context.start();
        //阻塞住，打一个字符结束。（让提供者不停掉）
        System.in.read();
    }

}

