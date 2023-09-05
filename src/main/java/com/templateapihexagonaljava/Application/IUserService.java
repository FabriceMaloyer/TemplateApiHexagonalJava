package com.templateapihexagonaljava.Application;



import com.templateapihexagonaljava.Domain.User;

import java.util.List;
import java.util.UUID;

public interface IUserService {
    UUID createUser(User user);
    User getuser(String userName);
    List<User> getAllUser();
}

