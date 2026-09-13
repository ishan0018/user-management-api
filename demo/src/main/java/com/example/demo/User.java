package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.*;

import java.util.List;

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

   @OneToMany(mappedBy = "user")
   @JsonIgnore
    private List<Post> posts;

}
