package ru.learn.tusk.service.impl;

import org.springframework.stereotype.Service;
import ru.learn.tusk.domain.user.User;
import ru.learn.tusk.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User gerById(Long id) {
        return null;
    }

    @Override
    public User getByUsername(String username) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public boolean isTaskOwner(Long userId, Long taskId) {
        return false;
    }

    @Override
    public void delete(Long id) {

    }

}
