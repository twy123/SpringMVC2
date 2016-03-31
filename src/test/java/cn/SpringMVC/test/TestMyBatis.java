package cn.SpringMVC.test;

/**
 * Created by wenyuan on 2016/3/31.
 */
import javax.annotation.Resource;

import cn.SpringMVC.model.TEST;
import cn.SpringMVC.service.ITestsService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;


@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})

public class TestMyBatis {
    private static Logger logger = Logger.getLogger(TestMyBatis.class);
    @Resource
    private ITestsService userService;

    @Test
    public void test1() {
        TEST user = userService.getTestById(1);
        logger.info(JSON.toJSONString(user));
    }
}
