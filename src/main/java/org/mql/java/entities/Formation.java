package org.mql.java.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Formation")
public class Formation {


	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="id")
  private int id ;
	
	@Column(name="title")
   private String title;
	
	@Column(name="creatingDate")
   private String creatingDate;
	
	@Column(name="creatingby")
   private String creatingby;
	
	@Column(name="category")	
   private String category ; 
	
	public Formation() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Formation(String title, String creatingDate, String creatingby, String category) {
		super();
		this.title = title;
		this.creatingDate = creatingDate;
		this.creatingby = creatingby;
		this.category = category;
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


	public String getCreatingDate() {
		return creatingDate;
	}


	public void setCreatingDate(String creatingDate) {
		this.creatingDate = creatingDate;
	}


	public String getCreatingby() {
		return creatingby;
	}


	public void setCreatingby(String creatingby) {
		this.creatingby = creatingby;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	@Override
	public String toString() {
		return "Formation [id=" + id + ", title=" + title + ", creatingDate=" + creatingDate + ", creatingby="
				+ creatingby + ", category=" + category + "]";
	}
	
	



	
	
	

}
