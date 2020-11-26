package com.yehl.redis.controller;

import com.yehl.redis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

    @Autowired
    RedisService redisService;

    @RequestMapping("/getValue")
    public String getValue() {
        String value = redisService.getValue("keyone");
        System.out.println("Redis Controller ==============> returning value: " + value);
        return value;
    }
}
