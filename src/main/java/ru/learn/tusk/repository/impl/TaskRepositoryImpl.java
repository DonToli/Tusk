package ru.learn.tusk.repository.impl;

import org.springframework.stereotype.Repository;
import ru.learn.tusk.domain.task.Task;
import ru.learn.tusk.repository.TaskRepository;

import java.util.List;
import java.util.Optional;

@Repository
public class TaskRepositoryImpl implements TaskRepository {

    @Override
    public Optional<Task> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Task> findAllByUser(Long userId) {
        return null;
    }

    @Override
    public void assignToUserId(Long taskId, Long userId) {

    }

    @Override
    public void update(Task task) {

    }

    @Override
    public void create(Task task) {

    }

    @Override
    public void delete(Task task) {

    }

}

