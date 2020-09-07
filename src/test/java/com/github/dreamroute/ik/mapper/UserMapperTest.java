package com.github.dreamroute.ik.mapper;

import com.github.dreamroute.ik.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author w.dehai
 */
@SpringBootTest
@AutoConfigureTestDatabase
class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    void selectByIdTest() {
        User user = userMapper.selectById(1L);
        System.err.println(user);
    }

    @Test
    void insertTest() {
        User user = new User();
        user.setName("w.dehai");
        int result = userMapper.insertExcludeNull(user);
        System.err.println(result);
    }

}

