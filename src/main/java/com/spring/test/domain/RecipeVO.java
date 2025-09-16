package com.spring.test.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RecipeVO {

    private int id;

    private String name;

    private String category;

    private String calories;
}