package com.moddelMapper.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Table
        (
                name= "posts"
        )
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name= "title",nullable= false)
    private String title;

    @Column(name= "description",nullable= false)
    private String description;

    @Column(name= "content",nullable= false)
    private String content;

    @Column(name= "mobile",nullable= false)
    private String mobile;

    @Column(name= "email",nullable= false)
    private String email;

}
