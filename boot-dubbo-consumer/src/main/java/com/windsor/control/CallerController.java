package com.windsor.control;

import com.windsor.beans.UserAddress;
import com.windsor.service.OrderSv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CallerController {

    @Autowired
    private OrderSv orderSv;

    @GetMapping("/call")
    @ResponseBody
    public List<UserAddress> call(String userId) throws Exception {
        System.out.println("call in consumer...");
        return orderSv.supportDests(userId);
    }

}
