package ru.learn.tusk.service;

import ru.learn.tusk.domain.user.User;

public interface UserService {

    User gerById(Long id);

    User getByUsername(String username);

    User update(User user);

    User create(User user);

    boolean isTaskOwner(Long userId, Long taskId);

    void  delete(Long id);

}
