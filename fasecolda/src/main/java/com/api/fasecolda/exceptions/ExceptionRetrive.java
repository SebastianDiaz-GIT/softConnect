package com.api.fasecolda.exceptions;

public class ExceptionRetrive extends Exception{
    public ExceptionRetrive() {
    }

    public ExceptionRetrive(String message) {
        super(message);
    }

    public ExceptionRetrive(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionRetrive(Throwable cause) {
        super(cause);
    }

    public ExceptionRetrive(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
