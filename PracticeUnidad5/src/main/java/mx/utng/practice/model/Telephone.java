package mx.utng.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="telephone")
public class Telephone {
	@Id @GeneratedValue
	private Long id;
	@Column(length=30)
	private String brand;
	@Column(length=20)
	private String model;
	@Column(length=20)
	private String company;
	
	public Telephone(String brand, String model, String company) {
		super();
		this.brand = brand;
		this.model = model;
		this.company = company;
	}


	public Telephone() {
		this("","","");
	}
	


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}



	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	@Override
	public String toString() {
		return "Telephone [id=" + id + ", brand=" + brand + ", model=" + model + ", company=" + company + "]";
	}


	
}

