package com.example.juicyapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.juicyapp.models.Article;
import com.example.juicyapp.repository.ArticleRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class HelloWorldController {
    private final ArticleRepository repository;
    @GetMapping("/get-all")
    public List<Article> test() {
        return repository.findAll();

    }
}
