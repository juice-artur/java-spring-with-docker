package com.example.juicyapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.juicyapp.models.*;

public interface ArticleRepository  extends JpaRepository<Article, Long>{
    
}
