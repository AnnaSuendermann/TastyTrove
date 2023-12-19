package com.sa.tastytrove.entity;				
				
import jakarta.persistence.Column;				
import jakarta.persistence.Entity;				
import jakarta.persistence.Id;				
import jakarta.persistence.Table;	

@Entity
@Table(name= "Ratings")

// TODO check names and add connection to other tables

public class Rating {
	@Id
	@Column(name= "RatingID")
	private Long id;

	@Column(name= "RecipeID")
	private Long id;

	@Column(name= "Satisfaction")
	private int rating;

	public Long getRatingID(){

	}

	public Long getRecipeID(){

	}
	
	public void setSatisfaction(int rating){
		this.rating = rating;
	}
	
	public int getSatisfaction(){
		return rating;
	}	

}
