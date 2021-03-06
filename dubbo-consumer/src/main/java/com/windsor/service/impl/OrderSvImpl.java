package com.windsor.service.impl;

import com.windsor.beans.UserAddress;
import com.windsor.service.OrderSv;
import com.windsor.service.UserSv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderSvImpl implements OrderSv {

    @Autowired
    UserSv userSv;

    public List<UserAddress> supportDests(String userId) throws Exception {
        //支援新冠，世界加油！
        List<UserAddress> address = userSv.getAddress(userId);
        for (UserAddress userAddress : address) {
            System.out.println(userAddress);
        }

        return address;
    }
}
