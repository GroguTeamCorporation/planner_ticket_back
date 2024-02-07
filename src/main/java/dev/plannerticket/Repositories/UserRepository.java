package dev.plannerticket.Repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import dev.plannerticket.Models.User;

public interface UserRepository extends JpaRepository <User, Long>{
    public Optional<User> findByUsername(String username);


    
}
