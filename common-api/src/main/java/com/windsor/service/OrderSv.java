package com.windsor.service;

import com.windsor.beans.UserAddress;

import java.util.List;

/**
 * 订单接口类
 *
 * @author: fangwc
 * @date: 2020/6/18 16:28
 */
public interface OrderSv {
    /**
     * 支援地点列表
     *
     * @throws Exception
     * @return
     */
    List<UserAddress> supportDests(String userId) throws Exception;
}
