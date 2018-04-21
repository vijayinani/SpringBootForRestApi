package com.inani.vijay.springbootforrestapi;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlogRepository extends JpaRepository<Blog, Integer> {

    // custom query to search to blog post by title or content
    List<Blog> findByTitleContainingOrContentContaining(String text, String textAgain);

}