package com.fitness.userservice.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class SignInResponse {

    @NotBlank(message = "First Name is required")
    private final String firstName;

    private final String lastName;

    @NotBlank(message = "Email is required")
    private final String email;

    @NotBlank(message = "Email is required")
    private final String password;

    public SignInResponse(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

}
