package com.templateapihexagonaljava.Application;

import com.templateapihexagonaljava.Domain.User;
import com.templateapihexagonaljava.Infrastructure.IUserRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Data
@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepository _userRepository;

    @Override
    public UUID createUser(User user) {
        // Business logic and validation
        User newUser = new User();
        newUser.setUserName(user.getUserName());
        newUser.setEmail(user.getEmail());
        newUser.setId(UUID.randomUUID());
        _userRepository.save(com.templateapihexagonaljava.Infrastructure.User.toEntities(newUser));

        return newUser.getId();
    }

    @Override
    public User getuser(String userName) {
       return  _userRepository.getuser(userName);
    }

    @Override
    public List<User> getAllUser() {
        return _userRepository.getAllUser();
    }
}
