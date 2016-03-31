package cn.SpringMVC.service.impl;

import cn.SpringMVC.dao.TESTMapper;
import cn.SpringMVC.model.TEST;
import cn.SpringMVC.service.ITestsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by wenyuan on 2016/3/30.
 */
@Service("TestService")
public class TestsServiceImpl implements ITestsService{

    @Resource
    private TESTMapper testMapper;

    public TEST getTestById(int TestId) {
        return this.testMapper.selectByPrimaryKey(TestId);
    }
}
