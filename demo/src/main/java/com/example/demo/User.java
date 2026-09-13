package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.*;

@Entity
@Setter
@Getter
public class User {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   @NotBlank(message = "Name is required")
   private String name;

   @NotBlank(message = "Email is required")
   @Email(message = "Email format is incorrect")
   private String email;

   @NotBlank(message = "Password is required")
   private String password;

}
