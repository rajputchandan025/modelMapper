package com.moddelMapper.controller;

import com.moddelMapper.entity.Post;
import com.moddelMapper.entity.dto;
import com.moddelMapper.repository.PostRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class postController {
    @Autowired
    private PostRepository postRepo;

    @Autowired
    private ModelMapper modelMapper;


    //    signUp feature


//    @PostMapping
//    public ResponseEntity<?> createPost(@RequestBody Post post) {
//        Boolean checkEmail = postRepo.existsByEmail(post.getEmail());
//
//        if(postRepo.existsByEmail(post.getEmail())){
//            return new ResponseEntity<>("Email already exist", HttpStatus.BAD_REQUEST);
//        }
//        if(postRepo.existsByMobile(post.getMobile())){
//            return new ResponseEntity<>("Mobile already exist", HttpStatus.BAD_REQUEST);
//        }
//        Post save = postRepo.save(post);
//        return new ResponseEntity<>(save, HttpStatus.CREATED);
//       }

//     conversion by modelMapper

//    @PostMapping
//    public ResponseEntity<dto> savePost(@RequestBody dto dtos){
//
//        Post post = mapToentity(dtos);
//        Post save = postRepo.save(post);
//        dto dto = mapToDto(save);
//        return  new ResponseEntity<>(dto, HttpStatus.CREATED);
//    }     Post  mapToentity(dto dtos){
//         Post post = modelMapper.map(dtos, Post.class);
//         return post;
//     }     dto mapToDto(Post post){
//         dto dtos = modelMapper.map(post, dto.class);
//         return dtos;

 //    }

}
