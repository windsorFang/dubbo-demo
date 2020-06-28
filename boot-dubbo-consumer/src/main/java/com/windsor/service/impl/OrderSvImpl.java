package com.windsor.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.windsor.beans.UserAddress;
import com.windsor.service.OrderSv;
import com.windsor.service.UserSv;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
/**
 * dubbo容错：注册中心挂了之后，服务仍然可用，因为有本地缓存，还可以设置直连，不走zk
 */
public class OrderSvImpl implements OrderSv {

    /**
     * dubbo注解注入远程服务，相当于<dubbo:reference></>
     */
    //retry次数跟timeout需要配合使用，提高可用性。但是retry不适用服务接口报错的情况，报错不会重试，会直接抛出异常。
    //负载均衡：随机，轮询，一致性hash，最小活跃
    @Reference(loadbalance = "roundrobin")
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
