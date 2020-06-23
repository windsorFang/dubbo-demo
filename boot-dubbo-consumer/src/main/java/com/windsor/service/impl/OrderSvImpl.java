package com.windsor.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.windsor.beans.UserAddress;
import com.windsor.service.OrderSv;
import com.windsor.service.UserSv;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderSvImpl implements OrderSv {

    /**
     * dubbo注解注入远程服务，相当于<dubbo:reference></>
     */
    @Reference
    private UserSv userSv;

    public List<UserAddress> supportDests(String userId) throws Exception {
        //支援新冠，世界加油！
        List<UserAddress> address = userSv.getAddress(userId);
        for (UserAddress userAddress : address) {
            System.out.println("boot:"+userAddress);
        }
        return address;
    }
}
