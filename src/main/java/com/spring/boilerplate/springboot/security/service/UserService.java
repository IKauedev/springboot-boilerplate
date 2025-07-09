package com.spring.boilerplate.springboot.security.service;

import com.spring.boilerplate.springboot.model.User;
import com.spring.boilerplate.springboot.security.dto.AuthenticatedUserDto;
import com.spring.boilerplate.springboot.security.dto.RegistrationRequest;
import com.spring.boilerplate.springboot.security.dto.RegistrationResponse;

public interface UserService {
    User findByUsername(String username);

    RegistrationResponse registration(RegistrationRequest registrationRequest);

    AuthenticatedUserDto findAuthenticatedUserByUsername(String username);
}
