package com.sa.tastytrove.entity;				
				
import jakarta.persistence.Column;				
import jakarta.persistence.Entity;				
import jakarta.persistence.Id;				
import jakarta.persistence.Table;	

@Entity
@Table(name= "RecipeCategories")

//TODO check names and add connection to other tables

public class Recipe_Categorie {
	@Id
	@Column(name= "CategoryID")
	private long categoryid;

	@Column(name= "RecipeID")
	private long recipeid;

	public long getCategoryId(){
		
	}

	public long getRecipeId(){

	}
    
}
