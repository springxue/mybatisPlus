package com.casic.mybatisplusdemo;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.casic.mybatisplusdemo.entity.User;
import com.casic.mybatisplusdemo.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    //mybatisPlus实现分页
    @Test
    public void testPagelist(){
        Page page=new Page(1,3);
        userMapper.selectPage(page,null);
        List records = page.getRecords();//每页数据

        long current = page.getCurrent();//当前页
        long total = page.getTotal();//总条数
        long size = page.getSize();//总页数
        boolean previous = page.hasPrevious();//是否有上一页
        boolean next = page.hasNext();//是否有下一页
        System.out.println(records);
        System.out.println(current);
        System.out.println(total);
        System.out.println(size);
        System.out.println(previous);
        System.out.println(next);

    }


    //简单的条件查询(map中的key值写数据库字段名，比如说些create_time而不是bean中的createTime)
    @Test
    public void testConditionSelect(){
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("name","东方不败");
        map.put("id",1204225388305039362L);
        List list = userMapper.selectByMap(map);
        System.out.println(list);
    }


    //根据id进行批量查询
    @Test
    public void testBatchIds(){
        List<User> users = userMapper.selectBatchIds(Arrays.asList(1, 2, 3));
        System.out.println(users);
    }


    /**
     * 测试乐观锁
     */
    @Test
    public void testOptimisticLocker(){
        User user = userMapper.selectById(1204289395867058178L);
        user.setName("东方不败");
        int i = userMapper.updateById(user);
        System.out.println(i);
    }


    /**
 * 添加用户
 */
    @Test
    public void testAddUser(){
        User user=new User();
        user.setAge(99);
        user.setName("周玲");
        user.setEmail("周周@qq.com");
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
