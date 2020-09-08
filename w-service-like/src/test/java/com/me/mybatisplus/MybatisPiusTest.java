package com.me.mybatisplus;

import com.me.likes.likesApplication;
import com.me.likes.repository.entity.YueLikeEntity;
import com.me.likes.repository.mapper.YueLikeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @program: w_parent->MybatisPiusTest
 * @description: MybatisPlus 测试
 * @author: szh
 * @create: 2020-07-27 13:51
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = likesApplication.class)
public class MybatisPiusTest {

    @Autowired
    private YueLikeMapper yueLikeMapper;

    //查询所有
    @Test
    public void testSelectAll() {
        List<YueLikeEntity> userList = yueLikeMapper.selectList(null);
        System.out.println(userList);
    }
}