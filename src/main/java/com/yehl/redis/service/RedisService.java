package com.yehl.redis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisService {

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    public String getValue(String key) {
        String value = stringRedisTemplate.opsForValue().get(key);
        return value;
    }
}
