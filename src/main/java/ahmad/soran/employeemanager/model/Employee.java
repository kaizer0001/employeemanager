package ahmad.soran.employeemanager.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Long id;
	private String name;
	private String phone;
	private String email;
	private String jobTile;
	
	public Employee() {}

	public Employee(Long id, String name, String phone, String email, String jobTile) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.jobTile = jobTile;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJobTile() {
		return jobTile;
	}

	public void setJobTile(String jobTile) {
		this.jobTile = jobTile;
	}

	@Override
	public String toString() {
		return "Employee{" + 
				"id=" + id + 
				", name='" + name + '\'' +
				", phone='" + phone + '\'' +
				", email='" + email + '\'' +
				", jobTile='" + jobTile + '\'' +
				"}";
	}
}
