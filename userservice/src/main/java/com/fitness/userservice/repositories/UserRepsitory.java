package com.fitness.userservice.repositories;

import com.fitness.userservice.models.User;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepsitory extends JpaRepository<User,Long> {

    boolean existsByEmail(@NotBlank(message = "Email is required") String email);
}
