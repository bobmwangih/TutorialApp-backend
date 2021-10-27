package com.bob.tutorialapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "tutorials")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Tutorial {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "published")
	private boolean published;

	
	
	public Tutorial(String title, String description, boolean published) {
		super();
		this.title = title;
		this.description = description;
		this.published = published;
	}
	
	
	
}
