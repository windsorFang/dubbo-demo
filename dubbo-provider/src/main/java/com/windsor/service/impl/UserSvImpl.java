package com.windsor.service.impl;

import com.windsor.beans.UserAddress;
import com.windsor.service.UserSv;

import java.util.ArrayList;
import java.util.List;

public class UserSvImpl implements UserSv {

    public List<UserAddress> getAddress(String userId) throws Exception {
        List<UserAddress> users = new ArrayList<>();

        UserAddress user1 = new UserAddress(1, "北京新发地", "1001", "13600000000");
        UserAddress user2 = new UserAddress(2, "日本东京", "1002", "13600000001");
        UserAddress user3 = new UserAddress(3, "湖北武汉", "1003", "13600000001");
        users.add(user1);
        users.add(user2);
        users.add(user3);

        return users;
    }
}
