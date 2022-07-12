package com.poying.springbootecommerce.dao;

import com.poying.springbootecommerce.dto.UserRegisterRequest;
import com.poying.springbootecommerce.model.User;

public interface UserDao {
    Integer createUser(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);

    User getUserByEmail(String email);
}
