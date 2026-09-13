package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    public Post createPost(Long userId,Post post){
        User user = userRepository.findById(userId).orElseThrow(()->new UserNotFoundException("User not found with this id: "+userId));
        post.setUser(user);
        return postRepository.save(post);
    }
    public List<Post> getPostByUser(Long userId){
        return postRepository.findByUserId(userId);
    }
}
