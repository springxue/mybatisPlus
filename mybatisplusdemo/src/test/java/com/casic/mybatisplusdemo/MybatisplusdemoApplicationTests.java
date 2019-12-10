package com.casic.mybatisplusdemo;

import com.casic.mybatisplusdemo.entity.User;
import com.casic.mybatisplusdemo.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisplusdemoApplicationTests {
    @Autowired
    UserMapper userMapper;

    /**
     * 查询所有用户
     */
    @Test
    public void testGetAllUser() {
        System.out.println(userMapper.selectList(null));
    }
/**
 * 添加用户
 */
    @Test
    public void testAddUser(){
        User user=new User();
        user.setAge(99);
        user.setName("薛振春");
        user.setEmail("tom@qq.com");
        int rows=userMapper.insert(user);
        System.out.println(rows);
    }
    /**
     * 添加用户
     */
    @Test
    public void testUpdateUser(){
        User user=new User();
        user.setAge(99);
        user.setName("周玲");
        user.setEmail("zhouling@qq.com");
        user.setId(1204039087392481282L);
        int rows=userMapper.updateById(user);
        System.out.println(rows);
    }
}
