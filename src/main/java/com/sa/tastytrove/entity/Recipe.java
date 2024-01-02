package com.sa.tastytrove.entity;

import jakarta.persistence.*;
import java.util.HashSet;

@Entity
@Table(name = "Recipes")
public class Recipe{
	@Id
	@GeneratedValue
	@Column(name = "RecipeID")
	private Long recipeId;

	@Column(name = "Name")
	private String name;

	@Column(name = "Creator")
	private String creator;
	
	@Column(name = "Description")
	private String description;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private HashSet<Ingredient> ingredients = new HashSet<>();

	public void setRecipeId(Long recipeId){
		this.recipeId = recipeId;
	}

	public Long getRecipeId(){
		return recipeId;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setCreator(String creator){
		this.creator = creator;
	}

	public String getCreator(){
		return creator;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setIngredient(Ingredient ingredient){
		this.ingredients.add(ingredient);
	}
}
