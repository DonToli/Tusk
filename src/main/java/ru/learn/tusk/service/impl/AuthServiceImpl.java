package ru.learn.tusk.service.impl;

import org.springframework.stereotype.Service;
import ru.learn.tusk.service.AuthService;
import ru.learn.tusk.web.dto.auth.JwtRequest;
import ru.learn.tusk.web.dto.auth.JwtResponse;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public JwtResponse login(JwtRequest loginRequest) {
        return null;
    }

    @Override
    public JwtResponse refresh(String refreshToken) {
        return null;
    }

}
