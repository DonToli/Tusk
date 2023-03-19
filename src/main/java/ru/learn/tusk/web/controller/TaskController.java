package ru.learn.tusk.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.learn.tusk.domain.task.Task;
import ru.learn.tusk.service.TaskService;
import ru.learn.tusk.web.dto.task.TaskDto;
import ru.learn.tusk.web.dto.validation.OnUpdate;
import ru.learn.tusk.web.mapper.TaskMapper;

@RestController
@RequestMapping("api/v1/tasks")
@RequiredArgsConstructor
@Validated
public class TaskController {

    private final TaskService taskService;
    private final TaskMapper taskMapper;

@PutMapping
public TaskDto update(@Validated(OnUpdate.class)@RequestBody TaskDto dto){
    Task task = taskMapper.toEntity(dto);
    Task updateTask = taskService.update(task);
    return taskMapper.toDto(updateTask);
}

    @GetMapping("/{id}")
    public TaskDto getById(@PathVariable Long id){
        Task task = taskService.getById(id);
        return taskMapper.toDto(task);
    }
@DeleteMapping("{/id}")
    public void deleteById(@PathVariable Long id){
    taskService.delete(id);
    }



}
