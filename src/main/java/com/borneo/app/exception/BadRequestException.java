package com.borneo.app.exception;

public class BadRequestException extends Exception {

    public BadRequestException(Exception exception) {
        super(exception);
    }

    public BadRequestException(String message) {
        super(message);
    }

    public BadRequestException(String message, Exception exception) {
        super(message, exception);
    }

}
