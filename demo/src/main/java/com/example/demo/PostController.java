package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users/{userId}/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping
    public ResponseEntity<Post> createPost(@PathVariable Long userId, @RequestBody Post post){
        Post savedPost = postService.createPost(userId,post);
        return new ResponseEntity<>(savedPost, HttpStatus.CREATED);
    }
    @GetMapping
    public List<Post> getPostByUser(@PathVariable Long userId){
        return postService.getPostByUser(userId);
    }
}
