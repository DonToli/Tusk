package ru.learn.tusk.web.dto.auth;

import lombok.Data;

@Data
public class JwtResponse {

private Long id;
private String username, accessToken, refreshToken;


}
