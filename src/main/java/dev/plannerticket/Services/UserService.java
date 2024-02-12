package dev.plannerticket.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.plannerticket.Models.User;
import dev.plannerticket.Repositories.UserRepository;
import io.micrometer.common.lang.NonNull;


@Service
public class UserService {

    UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }
 
    public List<User> getAll() {
        List<User> users = repository.findAll();
        return users;
    }

    public User save(@NonNull User type) {
        User newUser = new User();

        repository.save(newUser);
        return newUser;
    }
    
}
