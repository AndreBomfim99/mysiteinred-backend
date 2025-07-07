package com.mysiteinred.backend.controller;

import com.mysiteinred.backend.model.Article;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/articles")
@CrossOrigin(origins = "*") // Permite chamadas do frontend
public class ArticleController {

    private List<Article> articles = new ArrayList<>();

    public ArticleController() {
        articles.add(new Article(1L, "Primeiro Post", "Resumo do primeiro post",
                "Conteúdo completo do primeiro post.", "https://via.placeholder.com/800x400", "2025-06-23"));
        articles.add(new Article(2L, "Segundo Post", "Resumo do segundo post",
                "Conteúdo completo do segundo post.", "https://via.placeholder.com/800x400", "2025-06-22"));
        articles.add(new Article(3L, "Terceiro Post", "Resumo do terceiro post",
                "Conteúdo completo do terceiro post.", "https://via.placeholder.com/800x400", "2025-06-21"));
    }

    @GetMapping
    public List<Article> getAllArticles() {
        return articles;
    }

    @GetMapping("/{id}")
    public Article getArticleById(@PathVariable Long id) {
        return articles.stream()
                .filter(a -> a.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}


