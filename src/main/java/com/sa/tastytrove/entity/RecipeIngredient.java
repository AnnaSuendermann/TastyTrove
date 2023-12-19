package com.sa.tastytrove.entity;				
				
import jakarta.persistence.Column;				
import jakarta.persistence.Entity;				
import jakarta.persistence.Id;				
import jakarta.persistence.Table;				
				
@Entity				
// TODO check name and add information for table interaction later				
@Table(name = "RecipeIngredients")				
public class RecipeIngredient{				
	@Id			
	@Column(name = "RecipeID")			
	private Long id;			
				
	@Column(name = "IngredientID")			
	private Long id;			
				
	@Column(name = "Amount")			
	private Long id;			
	
	public int getRecipeID(){

	}
	
	public int getIngredientID(){

	}

	public void setAmount( 		
				
