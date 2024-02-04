package tfg.proyecto.school.entities;

import java.io.Serializable;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Exam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	@OneToMany(mappedBy = "exam", cascade = CascadeType.ALL,orphanRemoval = true)
	@JsonIgnore
	private Set<UserExam> userExams;
	
	
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
	public Set<UserExam> getUserExams() {
		return userExams;
	}
	public void setUserExams(Set<UserExam> userExams) {
		this.userExams = userExams;
	}
	
	

}
