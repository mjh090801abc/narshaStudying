package com.spring.test.mapper;

import com.spring.test.domain.RecipeVO;

import java.util.List;

public interface RecipeMapper {

    List<RecipeVO> selectAllRecipes();
}
