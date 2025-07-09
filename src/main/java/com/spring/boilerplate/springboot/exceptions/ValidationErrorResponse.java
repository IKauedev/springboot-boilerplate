package com.spring.boilerplate.springboot.exceptions;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.List;

public class ValidationErrorResponse {
    private HttpStatus status;
    private LocalDateTime time;
    private List<String> message;

    public ValidationErrorResponse(HttpStatus status, LocalDateTime time, List<String> message) {
        this.status = status;
        this.time = time;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public List<String> getMessage() {
        return message;
    }

    public void setMessage(List<String> message) {
        this.message = message;
    }
}
