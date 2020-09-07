package com.github.dreamroute.ik.service;

import com.github.dreamroute.ik.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author w.dehai
 */
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    void selectByIdTest() {
        User user = userService.selectById(100L);
        assertEquals("100", user.getName());
    }

}
