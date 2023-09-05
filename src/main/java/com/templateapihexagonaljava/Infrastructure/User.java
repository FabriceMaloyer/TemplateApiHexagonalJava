package com.templateapihexagonaljava.Infrastructure;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "User")
public class User {
    @Id
    @Column(name = "id")
    private UUID id;
    @Column(name = "username")
    private String userName;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;

    public static User toEntities(com.templateapihexagonaljava.Domain.User input){
        User user = new User();
        user.email = input.getEmail();
        user.id = input.getId();
        user.userName = input.getUserName();
        user.password = input.getPassword();

        return user;
    }

    public static com.templateapihexagonaljava.Domain.User toDomain(User input){
        com.templateapihexagonaljava.Domain.User user = new com.templateapihexagonaljava.Domain.User();
        user.setEmail(input.email);
        user.setId(input.id);
        user.setUserName(input.userName);
        user.setPassword(input.password);

        return user;
    }
}