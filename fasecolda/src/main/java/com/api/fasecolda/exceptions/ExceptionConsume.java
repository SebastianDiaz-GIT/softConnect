package com.api.fasecolda.exceptions;

public class ExceptionConsume extends Exception{
    public ExceptionConsume() {
    }

    public ExceptionConsume(String message) {
        super(message);
    }

    public ExceptionConsume(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionConsume(Throwable cause) {
        super(cause);
    }

    public ExceptionConsume(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
