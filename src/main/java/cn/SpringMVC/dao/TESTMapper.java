package cn.SpringMVC.dao;

import cn.SpringMVC.model.TEST;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface TESTMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TEST record);

    int insertSelective(TEST record);

    TEST selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TEST record);

    int updateByPrimaryKey(TEST record);

    public List<TEST> selectDetailById(Integer id);
}