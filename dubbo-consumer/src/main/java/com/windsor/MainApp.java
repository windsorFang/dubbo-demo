package com.windsor;

import com.windsor.beans.UserAddress;
import com.windsor.service.OrderSv;
import com.windsor.service.UserSv;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * consumer
 *
 * @author: fangwc
 * @date: 2020/6/18 21:05
 */
public class MainApp {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("consumer.xml");
        ioc.start();
        OrderSv bean = ioc.getBean(OrderSv.class);
        bean.supportDests("1003");

        /*UserSv userService = (UserSv)ioc.getBean("userService");
        List<UserAddress> address = userService.getAddress("1001");
        for (UserAddress userAddress : address) {
            System.out.println(userAddress);
        }*/

        System.out.println("调用remote完成！");

        System.in.read();
    }
}
