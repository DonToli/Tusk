package ru.learn.tusk.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.learn.tusk.domain.task.Task;
import ru.learn.tusk.domain.user.User;
import ru.learn.tusk.service.TaskService;
import ru.learn.tusk.service.UserService;
import ru.learn.tusk.web.dto.task.TaskDto;
import ru.learn.tusk.web.dto.user.UserDto;
import ru.learn.tusk.web.dto.validation.OnCreate;
import ru.learn.tusk.web.dto.validation.OnUpdate;
import ru.learn.tusk.web.mapper.TaskMapper;
import ru.learn.tusk.web.mapper.UserMapper;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
@Validated
public class UserController {

    private final UserService userService;
    private final TaskService taskService;
    private final UserMapper userMapper;
    private final TaskMapper taskMapper;

    @PutMapping
    public UserDto update(@Validated(OnUpdate.class) @RequestBody UserDto dto){
        User user = userMapper.toEntity(dto);
        User updateUser = userService.update(user);
        return userMapper.toDto(updateUser);
    }

    @GetMapping("/{id}")
    public UserDto getById(@PathVariable Long id){
        User user = userService.gerById(id);



        return userMapper.toDto(user);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        userService.delete(id);
    }

    @GetMapping("/{id}/tasks")
    public List<TaskDto> getTaskByUserId(@PathVariable Long id){
        List<Task> tasks = taskService.getAllByUserId(id);
        return taskMapper.toDto(tasks);
    }

    @PostMapping("/{id}/tasks")
    public TaskDto createTask (@PathVariable Long id,
                               @Validated(OnCreate.class) @RequestBody TaskDto dto){
        Task task = taskMapper.toEntity(dto);
        Task createdTask = taskService.create(task,id);
        return taskMapper.toDto(createdTask);
    }

}
