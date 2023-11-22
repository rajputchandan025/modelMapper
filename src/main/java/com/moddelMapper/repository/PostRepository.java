package com.moddelMapper.repository;


import com.moddelMapper.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Long> {
    // You can add custom query methods here if needed



    Boolean existsByEmail(String email);
   Boolean  existsByMobile(String mobile);


}


