package ru.learn.tusk.repository;

import ru.learn.tusk.domain.user.Role;
import ru.learn.tusk.domain.user.User;

import java.util.Optional;

public interface UserRepository {

    Optional<User> findById(Long id);// проверка и авторизация

    Optional<User> findByUsername(String username);

    void update(User user);// сохраняем в БД

    void create(User user);//принимает юзера

    void insertUserRole(Long userId, Role role);// выдача ролей юзерам

    boolean isTaskOwner(Long userId, Long taskId);//проверка допусков

    void delete(Long id);
}
