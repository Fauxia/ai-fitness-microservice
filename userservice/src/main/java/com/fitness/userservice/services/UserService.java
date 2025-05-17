package com.fitness.userservice.services;

import com.fitness.userservice.dtos.SignInResponse;
import com.fitness.userservice.dtos.SignUpRequest;
import com.fitness.userservice.models.User;
import com.fitness.userservice.repositories.UserRepsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepsitory userRepsitory;

    public SignInResponse register(SignUpRequest request){
        if(userRepsitory.existsByEmail(request.getEmail())){
            throw new RuntimeException();
        }
        User user = new User();
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());

        userRepsitory.save(user);
        return new SignInResponse(request.getFirstName(),request.getLastName(),request.getEmail(),request.getPassword());
    }
    public SignInResponse getUser(String id){
        User user = userRepsitory.findById(Long.valueOf(id))
                .orElseThrow(()-> new RuntimeException("User not found"));

        return new SignInResponse(user.getFirstName(),user.getLastName(),user.getEmail(),user.getPassword());
    }
}
