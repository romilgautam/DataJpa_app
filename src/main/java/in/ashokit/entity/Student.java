package in.ashokit.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="STUDENT_DTLS")
public class Student {
 






	@Id
	@Column(name="student_id")
	private Integer id;
	@Column(name="student_name")
    private String name;
	@Column(name="student_rank")
    private Long rank;
	
	@Column(name="student_gender")
    private String gender;
	
	@Column(name = "ACTIVE_SW")
	private String activeSW;
	
	   public Student() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getRank() {
		return rank;
	}

	public void setRank(Long rank) {
		this.rank = rank;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getActiveSW() {
		return activeSW;
	}

	public void setActiveSW(String activeSW) {
		this.activeSW = activeSW;
	}

	public Student(Integer id, String name, Long rank, String gender, String activeSW) {
		super();
		this.id = id;
		this.name = name;
		this.rank = rank;
		this.gender = gender;
		this.activeSW = activeSW;
	}

	@Override
	public String toString() {
		return "Student [" + (id != null ? "id=" + id + ", " : "") + (name != null ? "name=" + name + ", " : "")
				+ (rank != null ? "rank=" + rank + ", " : "") + (gender != null ? "gender=" + gender + ", " : "")
				+ (activeSW != null ? "activeSW=" + activeSW : "") + "]";
	} 
	 
	
    
}
