package com.spring.test.service;

import com.spring.test.domain.RecipeVO;
import com.spring.test.mapper.RecipeMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    private final RecipeMapper recipeMapper;

    public RecipeService(RecipeMapper recipeMapper) {
        this.recipeMapper = recipeMapper;
    }

    public List<RecipeVO> getAllRecipes() {
        return recipeMapper.selectAllRecipes();
    }
}
