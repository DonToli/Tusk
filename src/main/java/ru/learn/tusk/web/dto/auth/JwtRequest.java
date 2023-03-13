package ru.learn.tusk.web.dto.auth;

import lombok.Data;

@Data
public class JwtRequest {

    private String username, password;



}
