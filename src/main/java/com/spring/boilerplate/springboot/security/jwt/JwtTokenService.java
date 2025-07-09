package com.spring.boilerplate.springboot.security.jwt;

import com.spring.boilerplate.springboot.security.mapper.UserMapper;
import com.spring.boilerplate.springboot.security.service.UserService;
import com.spring.boilerplate.springboot.model.User;
import com.spring.boilerplate.springboot.security.dto.AuthenticatedUserDto;
import com.spring.boilerplate.springboot.security.dto.LoginRequest;
import com.spring.boilerplate.springboot.security.dto.LoginResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class JwtTokenService {
    private UserService userService;
    private JwtTokenManager jwtTokenManager;
    private AuthenticationManager authenticationManager;

    public JwtTokenService(
            UserService userService,
            JwtTokenManager jwtTokenManager,
            AuthenticationManager authenticationManager
    ) {
        this.userService = userService;
        this.jwtTokenManager = jwtTokenManager;
        this.authenticationManager = authenticationManager;
    }

    public LoginResponse getLoginResponse(LoginRequest loginRequest) {
        final String username = loginRequest.getUsername();
        final String password = loginRequest.getPassword();

        final UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(username, password);
        authenticationManager.authenticate(usernamePasswordAuthenticationToken);

        final AuthenticatedUserDto authenticatedUserDto = userService.findAuthenticatedUserByUsername(username);
        final User user = UserMapper.INSTANCE.convertToUser(authenticatedUserDto);
        final String token = jwtTokenManager.generateToken(user);

        log.info("{} has successfully logged in!", user.getUsername());
        return new LoginResponse(token);
    }

}
