package com.templateapihexagonaljava.Infrastructure;


import java.util.List;
import java.util.UUID;

public interface IUserRepository {
    UUID save(User user);
    com.templateapihexagonaljava.Domain.User getuser(String userName);
    List<com.templateapihexagonaljava.Domain.User> getAllUser();
}
