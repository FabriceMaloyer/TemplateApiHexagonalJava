package com.templateapihexagonaljava.Domain;

import org.springframework.lang.Nullable;

import java.util.UUID;

public class User {
    @Nullable
    private UUID id;
    @Nullable
    private String userName;
    @Nullable
    private String password;
    @Nullable
    private String email;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

