package com;

import com.start.zzy.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@RestController
@RequestMapping("/test")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/insertTest")
    public void insertTest() throws ParseException {
//        for (int i = 1 ; i < 10; i++) {
//            User test = new User("王"+i,"男","数据" + i,i,null);
//            userMapper.insert(test);
//        }
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        User test = new User("王","男","数据" ,1,format.parse("2021-01-01"));
        userMapper.insert(test);

        User test2 = new User("王","男","数据" ,2,format.parse("2022-01-01"));
        userMapper.insert(test2);

        User test3 = new User("王","男","数据" ,1,format.parse("2021-02-01"));
        userMapper.insert(test3);

        User test4 = new User("王","男","数据" ,2,format.parse("2022-02-01"));
        userMapper.insert(test4);

        User test5 = new User("王","男","数据" ,1,format.parse("2021-03-01"));
        userMapper.insert(test5);

        User test6 = new User("王","男","数据" ,2,format.parse("2022-03-01"));
        userMapper.insert(test6);
    }
}
