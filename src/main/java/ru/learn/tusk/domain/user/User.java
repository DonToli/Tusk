package ru.learn.tusk.domain.user;

import lombok.Data;
import ru.learn.tusk.domain.task.Task;

import java.util.List;
import java.util.Set;

@Data
public class User {

    private Long id;
    private String name, username, password, passwordConfirmation;
    private Set<Role> roles;
    private List<Task> tasks;

}
