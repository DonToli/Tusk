package ru.learn.tusk.domain.exception;


// ошибка доступа пользователей к чужим задачам
public class AccessDeniedException extends RuntimeException {

    public AccessDeniedException() {
        super();
    }


}
