package com.poying.springbootecommerce.service;

import com.poying.springbootecommerce.dto.UserRegisterRequest;
import com.poying.springbootecommerce.model.User;

public interface UserService {
    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);
}
