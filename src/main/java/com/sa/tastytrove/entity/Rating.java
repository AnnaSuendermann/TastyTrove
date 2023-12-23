package com.sa.tastytrove.entity;				
				
import jakarta.persistence.Column;				
import jakarta.persistence.Entity;				
import jakarta.persistence.Id;				
import jakarta.persistence.Table;	

@Entity
@Table(name= "Ratings")

// TODO add connection to other tables

public class Rating {
	@Id
	@Column(name= "RatingID")
	private Long ratingId;

	@Column(name= "RecipeID")
	private Long recipeId;

	@Column(name= "Satisfaction")
	private int satisfaction;

	public Long getRatingID(){
		return ratingId;
	}

	public Long getRecipeID(){
		return recipeId;
	}

	public int getSatisfaction(){
		return satisfaction;
	}

	public void setSatisfaction(int satisfaction){
		this.satisfaction = satisfaction;
	}

	public void setRatingId(Long ratingId) {
		this.ratingId = ratingId;
	}

	public void setRecipeId(Long recipeId) {
		this.recipeId = recipeId;
	}
}
