package com.spring.boilerplate.springboot.security.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class RegistrationRequest {
    @NotEmpty(message = "{registration_name_not_empty}")
    private String name;

    @Email(message = "{registration_email_is_not_valid}")
    @NotEmpty(message = "{registration_email_not_empty}")
    private String email;

    @NotEmpty(message = "{registration_username_not_empty}")
    private String username;

    @NotEmpty(message = "{registration_password_not_empty}")
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "RegistrationRequest [name=" + name + ", email=" + email + ", username=" + username + ", password="
                + password + "]";
    }
}
