package com.spring.test.controller;

import com.spring.test.domain.RecipeVO;
import com.spring.test.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class RecipeController {

        @Autowired
        private RecipeService recipeService;

        @GetMapping("/recipe")
        public String recipePage(Model model) {
            List<RecipeVO> recipeList = recipeService.getAllRecipes();

            model.addAttribute("recipeList", recipeList);

            return "recipe/recipePage";
    }

}
