package com.spring.boilerplate.springboot.exceptions;

public class RegistrationException extends RuntimeException {
    private String errorMessage;

    public RegistrationException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
