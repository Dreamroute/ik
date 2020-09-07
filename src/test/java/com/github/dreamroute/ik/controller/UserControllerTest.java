package com.github.dreamroute.ik.controller;

import com.alibaba.fastjson.JSON;
import com.github.dreamroute.ik.entity.User;
import com.github.dreamroute.ik.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;

/**
 * @author w.dehai
 */
@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private UserService userService;

    @Test
    void selectByIdTest() throws Exception {
        User user = new User();
        user.setId(100L);
        user.setName("name");
        doReturn(user).when(userService).selectById(any());
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/user/selectById").param("id", "100")).andDo(MockMvcResultHandlers.print()).andReturn();
        System.err.println(result);
        String content = result.getResponse().getContentAsString();
        User u = JSON.parseObject(content, User.class);
        System.err.println(u);
    }

}
