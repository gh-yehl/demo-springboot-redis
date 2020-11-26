package com.yehl.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cache.CacheProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;

@Configuration
public class RedisConfig {
    @Autowired
    Environment environment;

    @Bean
    public RedisConnectionFactory redisCF() {
        LettuceConnectionFactory redisCF = new LettuceConnectionFactory();

        System.out.println("redis host ===================>" + environment.getProperty("spring.data.redis.host"));
        System.out.println("redis port ===================>" + environment.getProperty("spring.data.redis.port"));
        redisCF.setHostName(environment.getProperty("spring.data.redis.host"));
        redisCF.setPort(Integer.parseInt(environment.getProperty("spring.data.redis.port")));
        return redisCF;
    }

    @Bean
    public StringRedisTemplate stringRedisTemplate(RedisConnectionFactory redisCF) {
        return new StringRedisTemplate(redisCF);
    }
}
