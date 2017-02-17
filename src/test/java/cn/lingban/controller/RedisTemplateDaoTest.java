package cn.lingban.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by xukai on 2017/2/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:/bs-spring.xml"})
public class RedisTemplateDaoTest {
    @Autowired
    private RedisTemplateDao redisTemplateDao;

    @Test
    public void save2redis(){
        redisTemplateDao.save2Redis();
    }

    @Test
    public void get2Redis(){
        System.out.println(redisTemplateDao.get2Redis("x"));
    }
}
