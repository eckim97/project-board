package org.example.projectboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/articles")
@Controller
public class ArticleController {

    @GetMapping
    public String articles(ModelMap map) {
        map.addAttribute("articles", List.of());
        return "articles/index";
    }

    @GetMapping("/{articleId}")
    public String article(@PathVariable("articleId") Long articleId, ModelMap map) {
        map.addAttribute("article", "article"); //TODO: 구현할 때 여기를 실제 데이 넣어줘야 함
        map.addAttribute("articleComments", List.of());
        return "articles/detail";
    }
}
