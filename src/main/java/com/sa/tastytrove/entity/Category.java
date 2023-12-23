package com.sa.tastytrove.entity;				
				
import jakarta.persistence.Column;				
import jakarta.persistence.Entity;				
import jakarta.persistence.Id;				
import jakarta.persistence.Table;	


@Entity
@Table(name= "Categories")
public class Category {
	@Id
	@Column(name= "CategoryID")
	private Long categoryId;

	@Column(name= "Name")
	private String name;

	public void setCategoryId(Long categoryId){
		this.categoryId = categoryId;
	}   

	public Long getCategoryId(){
		return categoryId;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}


}
