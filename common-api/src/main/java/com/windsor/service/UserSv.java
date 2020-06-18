package com.windsor.service;

import com.windsor.beans.UserAddress;

import java.util.List;

/**
 * 用户接口类
 *
 * @author: fangwc
 * @date: 2020/6/18 16:16
 */
public interface UserSv {
    /**
     * 获取用户地址信息
     *
     * @param userId
     * @return
     * @throws Exception
     */
    List<UserAddress> getAddress(String userId) throws Exception;
}
