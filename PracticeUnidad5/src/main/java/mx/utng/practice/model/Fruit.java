package mx.utng.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fruit")
public class Fruit {
	@Id @GeneratedValue
	private Long id;
	@Column(length=50)
	private String name;
	@Column(length=30)
	private String color;
	@Column(length=30)
	private String form;
	@Column(length=30)
	private String description;
	
	
	
	public Fruit( String name, String color, String form, String description) {
		super();
		this.name = name;
		this.color = color;
		this.form = form;
		this.description = description;
	}

	public Fruit() {
		this("","","","");
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Fruit [id=" + id + ", name=" + name + ", color=" + color + ", form=" + form + ", description="
				+ description + "]";
	}


} 
