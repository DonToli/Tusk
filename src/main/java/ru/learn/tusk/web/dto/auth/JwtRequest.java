package ru.learn.tusk.web.dto.auth;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class JwtRequest {

    @NotNull(message = "User name must be not null.")
    private String username;
    @NotNull(message = "Password must be not null.")
    private String password;



}
