package com.github.dreamroute.ik.service.impl;

import com.github.dreamroute.ik.entity.User;
import com.github.dreamroute.ik.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author w.dehai
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User selectById(Long id) {
        Long idVal = id == null ? 100L : id;
        User u = new User();
        u.setId(idVal);
        u.setName(String.valueOf(id));
        return u;
    }
}
