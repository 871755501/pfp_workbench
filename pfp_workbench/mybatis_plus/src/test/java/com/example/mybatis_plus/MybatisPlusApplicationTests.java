package com.example.mybatis_plus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.mybatis_plus.entity.User;
import com.example.mybatis_plus.mapper.UserMapper;
import com.example.mybatis_plus.service.IUserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class MybatisPlusApplicationTests {

    @Resource
    UserMapper userMapper;

    @Test
    void contextLoads() {
        List<User> users = userMapper.selectList(new QueryWrapper<User>());
        if (!CollectionUtils.isEmpty(users)){
            users.forEach(System.out::println);
        }else {
            System.out.println("查出为空");
        }
    }

}
