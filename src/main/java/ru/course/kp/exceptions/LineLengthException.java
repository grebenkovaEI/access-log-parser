package ru.course.kp.exceptions;

public class LineLengthException extends RuntimeException{
    public LineLengthException() {
    }

    public LineLengthException(String message) {
        super(message);
    }

    public LineLengthException(String message, Throwable cause) {
        super(message, cause);
    }

    public LineLengthException(Throwable cause) {
        super(cause);
    }

    public LineLengthException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
