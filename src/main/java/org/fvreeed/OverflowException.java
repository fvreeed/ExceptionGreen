package org.fvreeed;

public class OverflowException extends RuntimeException {

    public OverflowException() {
    }

    @Override
    public String getMessage() {
        return "You are out of range";
    }

    @Override
    public synchronized Throwable getCause() {
        return new OverflowException();
    }

    @Override
    public String getLocalizedMessage() {
        return "You are out of range";
    }

    @Override
    public String toString() {
        return "OverflowException: You are out of range";
    }
}
