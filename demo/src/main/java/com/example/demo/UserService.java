package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public User login(String email,String password){
        User user = userRepository.findByEmail(email);
        if(user !=null && passwordEncoder.matches(password, user.getPassword())){
            return user;
        }
        return null;
    }

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    public User createUser(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }
    public User getUserById(Long id){
        return userRepository.findById(id).orElse(null);
    }
    public User updateUser(Long id,User updatedUser){
        User user = userRepository.findById(id).orElse(null);
        if(user != null){
             user.setName(updatedUser.getName());
             user.setEmail(updatedUser.getEmail());
             user.setPassword(passwordEncoder.encode(updatedUser.getPassword()));
             return userRepository.save(user);
        }
        return null;
    }
    public void deleteUser(Long id){
         userRepository.deleteById(id);
    }
}
