package com.sa.tastytrove.entity;				
				
import jakarta.persistence.Column;				
import jakarta.persistence.Entity;				
import jakarta.persistence.Id;				
import jakarta.persistence.Table;	


@Entity
@Table(name= "Categories")
public class Categorie {
	@Id
	@Column(name= "CategoryID")
	private Long id;

	@Column(name= "Name")
	private String name;

	public void setCategoryId(Long id){
		this.id = id;
	}   

	public Long getCategoryId(){
		return id;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}


}
