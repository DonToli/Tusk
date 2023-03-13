package ru.learn.tusk.service;

import ru.learn.tusk.web.dto.auth.JwtRequest;
import ru.learn.tusk.web.dto.auth.JwtResponse;

public interface AuthService {

    JwtResponse login(JwtRequest loginRequest);

    JwtResponse refresh(String refreshToken);

}
