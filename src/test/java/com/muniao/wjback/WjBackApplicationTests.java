package com.muniao.wjback;

import com.muniao.wjback.pojo.User;
import com.muniao.wjback.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WjBackApplicationTests
{
    @Autowired
    UserService userService;

    @Test
    void test1()
    {
        User user = userService.getByName("admin");
        System.out.println(user);

        System.out.println(userService.isExist("admin"));

        User user1 = new User();
        user1.setUsername("李小鹏1");
        user1.setPassword("123456");
        userService.add(user1);
        System.out.println(user1);

        System.out.println(userService.getByName("李小鹏1"));

    }

}
