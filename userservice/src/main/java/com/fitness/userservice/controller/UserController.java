package com.fitness.userservice.controller;


import com.fitness.userservice.dtos.SignInResponse;
import com.fitness.userservice.dtos.SignUpRequest;
import com.fitness.userservice.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/user")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<SignInResponse> registerUser(@Valid @RequestBody SignUpRequest request){
        return ResponseEntity.ok(userService.register(request));
    }
    @GetMapping("/{userId}")
    public ResponseEntity<SignInResponse> getUser(@PathVariable String userId){
        return ResponseEntity.ok(userService.getUser(userId));
    }
}
