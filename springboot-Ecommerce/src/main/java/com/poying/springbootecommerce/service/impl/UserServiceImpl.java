package com.poying.springbootecommerce.service.impl;

import com.poying.springbootecommerce.dao.UserDao;
import com.poying.springbootecommerce.dto.UserRegisterRequest;
import com.poying.springbootecommerce.model.User;
import com.poying.springbootecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }
}
