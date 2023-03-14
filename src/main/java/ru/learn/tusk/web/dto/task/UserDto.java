package ru.learn.tusk.web.dto.task;

import lombok.Data;
import ru.learn.tusk.domain.task.Task;
import ru.learn.tusk.domain.user.Role;

import java.util.List;
import java.util.Set;

@Data
public class UserDto {
    private Long id;
    private String name, username, password, passwordConfirmation;

}
