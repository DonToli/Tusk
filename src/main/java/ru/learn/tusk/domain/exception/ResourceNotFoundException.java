package ru.learn.tusk.domain.exception;


//ошибка с сообщением о том что нет записи
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
