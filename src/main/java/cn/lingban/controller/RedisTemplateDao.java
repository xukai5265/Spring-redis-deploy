package cn.lingban.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by xukai on 2017/2/15.
 */
@Component
public class RedisTemplateDao {

    @Autowired
    private RedisTemplate redisTemplate;

    public void save2Redis (String key,String k_1,String v_1){
        redisTemplate.boundHashOps(key).put(k_1,v_1);
    }


    public String get2Redis(String key){
        return (String) redisTemplate.boundHashOps("xukai").get(key);
    }

}
