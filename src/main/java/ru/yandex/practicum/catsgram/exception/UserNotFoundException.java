package ru.yandex.practicum.catsgram.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String s){
        super(s);
    }
}
