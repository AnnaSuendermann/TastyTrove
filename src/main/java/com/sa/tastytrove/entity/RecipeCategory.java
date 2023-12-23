package com.sa.tastytrove.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Recipe_Categories")
public class RecipeCategory {

//TODO check names and add connection to other tables
    @Id
    @Column(name = "CategoryID")
    private Long categoryId;

    @Column(name = "RecipeID")
    private Long recipeId;

    public Long getCategoryId(){
        return categoryId;
    }

    public Long getRecipeId(){
        return recipeId;
    }

    public void setCategoryId(Long categoryId){
        this.categoryId = categoryId;
    }

    public void setRecipeId(Long recipeId){
        this.recipeId = recipeId;
    }
}
