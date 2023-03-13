package ru.learn.tusk.web.dto.task;

import ru.learn.tusk.domain.task.Status;

import java.time.LocalDateTime;

public class TaskDto {
    private Long id;
    private String title;
    private String description;
    private Status status;
    private LocalDateTime expirationDate;

}
