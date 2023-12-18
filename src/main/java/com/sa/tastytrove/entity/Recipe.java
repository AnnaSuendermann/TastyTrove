package.com.sa.tastytrove.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Recipes")
public class Recipe{
	@Id
	// not sure about the name check later
	@Column(name = "RecipeID")
	private Long id;

	@Column(name = "Name")
	private String name;

	// String name correct?
	@Column(name = "Creator")
	private String creator;
	
	@Column(name = "Description")
	private String description;

	@Column(name = "EstimatedTime")
	private time = esttimatedTime;

	public void setId(Long Id){
		this.id = id;	
	}

	public Long getId(){
		return id;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		this.name = name;
	}


}
