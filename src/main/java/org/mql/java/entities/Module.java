package org.mql.java.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "Module")
public class Module {
 
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="id")
  private int id ;
	
	@Column(name="title")
   private String title;
	
	@Column(name="description")
   private String description;
	
	@Column(name="reting")
   private float reting;
	
	@Column(name="type")	
   private String type ; 
	public Module() {
		// TODO Auto-generated constructor stub
	}
	public Module(String title, String description, float reting, String type) {
		super();
		this.title = title;
		this.description = description;
		this.reting = reting;
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getReting() {
		return reting;
	}
	public void setReting(float reting) {
		this.reting = reting;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Module [id=" + id + ", title=" + title + ", description=" + description + ", reting=" + reting
				+ ", type=" + type + "]";
	}
	
	

}
