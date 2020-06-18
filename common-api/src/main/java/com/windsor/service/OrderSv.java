package com.windsor.service;

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
     */
    void supportDests(String userId) throws Exception;
}
