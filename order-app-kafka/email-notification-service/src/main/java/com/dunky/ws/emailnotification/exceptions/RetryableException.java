package com.dunky.ws.emailnotification.exceptions;

public class RetryableException extends RuntimeException{

    public RetryableException(Throwable cause) {
        super(cause);
    }

    public RetryableException(String message) {
        super(message);
    }
}
