package com.sa.tastytrove.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.*;

@Entity
@Table(name = "Recipes")
public class Recipe{
	@Id
	@Column(name = "RecipeID")
	private Long recipeId;

	@Column(name = "Name")
	private String name;

	@Column(name = "Creator")
	private String creator;
	
	@Column(name = "Description")
	private String description;

	// TODO time might not work in java -> research
	@Column(name = "EstimatedTime")
	private LocalTime estimatedTime;

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

	public void setEstimatedTime(LocalTime estimatedTime){
		this.estimatedTime = estimatedTime;
	}

	public LocalTime getEstimatedTime(){
		return estimatedTime;
	}












}
