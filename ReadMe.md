**Springboot + Redis 配置**  
1 - Redis 配置信息 - application.yml  
2 - Redis 数据连接配置 - RedisConfig.java  
 1) 创建Redis连接工厂，支持四种方式:  
        a: JedisConnectionFactory - 非线程安全  
        b: JredisConnectionFactory  
        c: LettuceConnectionFactory - 基于Netty，高性能  
        d: SrpConnectionFactory  
 2) 创建Redis模板(2种Template: RedisTemplate 和 StringRedisTemplate): 注入 Redis连接工厂Bean  
**Demo 采用了  LettuceConnectionFactory 连接工厂  和 StringRedisTemplate模板**

**Tips**  
1 - 使用 JedisConnectionFactory连接工厂模式，会额外需要 commons-pool2 依赖
    
