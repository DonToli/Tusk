package ru.learn.tusk.domain.exception;


//ошибка появляется в связи с jdbc
public class ResourceMappingException extends RuntimeException{

    public ResourceMappingException(String message) {
        super(message);
    }
}
