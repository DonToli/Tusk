package ru.learn.tusk.repository;

import ru.learn.tusk.domain.task.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepository {

    Optional<Task> findById (Long id);

    List<Task> findAllByUser(Long userId);

    void assignToUserId(Long taskId, Long userId);

    void  update(Task task);
    void  create(Task task);
    void  delete(Task task);

}
