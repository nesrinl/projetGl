package org.mql.java.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "Notification")
public class Notification {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="id")
  private int id ;
	
	@Column(name="SentBy")
   private int Sentby;
	
	@Column(name="Dest")
   private String Dest;
	
	@Column(name="date")
   private String date;
	
	@Column(name="content")	
   private String content ; 
	
	public Notification() {
		
	}

	public Notification(int sentby, String dest, String date, String content) {
		super();
		Sentby = sentby;
		this.Dest = dest;
		this.date = date;
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSentby() {
		return Sentby;
	}

	public void setSentby(int sentby) {
		Sentby = sentby;
	}

	public String getDest() {
		return Dest;
	}

	public void setDest(String dest) {
		Dest = dest;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Notification [id=" + id + ", Sentby=" + Sentby + ", Dest=" + Dest + ", date=" + date + ", content="
				+ content + "]";
	}
	
    
}
