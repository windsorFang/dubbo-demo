package com.windsor.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.windsor.beans.UserAddress;
import com.windsor.service.UserSv;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * dubbo注解暴露服务，相当于<dubbo:service></>
 *
 * @author: fangwc
 * @date: 2020/6/19 15:55
 */
@Service
//@Component
public class UserSvImpl implements UserSv {

    @Override
    public List<UserAddress> getAddress(String userId) throws Exception {
        List<UserAddress> users = new ArrayList<>();
        System.out.println("11111111111111");
        UserAddress user1 = new UserAddress(1, "北京新发地", "1001", "13600000000");
        UserAddress user2 = new UserAddress(2, "日本东京", "1002", "13600000001");
        UserAddress user3 = new UserAddress(3, "湖北武汉", "1003", "13600000001");
        users.add(user1);
        users.add(user2);
        users.add(user3);
//        new Random().nextInt(5);
//        TimeUnit.SECONDS.sleep(5);
        return users;
    }
}
