package com.sa.tastytrove.entity;				
				
import jakarta.persistence.Column;				
import jakarta.persistence.Entity;				
import jakarta.persistence.Id;				
import jakarta.persistence.Table;				
				
@Entity				
// TODO check name and add information for table interaction later				
@Table(name = "Recipes_Ingredients")
public class RecipeIngredient{				
	@Id			
	@Column(name = "RecipeID")			
	private Long recipeId;
				
	@Column(name = "IngredientID")			
	private Long ingredientId;
				
	@Column(name = "Amount")			
	private double amount;
	
	public void setRecipeId(Long recipeId){
		this.recipeId = recipeId;
	}

	public Long getRecipeID(){
		return recipeId;
	}

	public void setIngredientId(Long ingredientId){
		this.ingredientId = ingredientId;
	}

	public Long getIngredientID(){
		return ingredientId;
	}

	public void setAmount(double amount){
		this.amount = amount;
	} 		

	public double getAmount(){
		return amount;
	}

				
}
