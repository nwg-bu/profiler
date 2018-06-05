package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="modules")
public class Module {

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idNum;
	
	@NotNull
	@Column
	private String course;
	
	@NotNull
	@Column
	private int partNum;
	
	@NotNull
	@Column
	private String partTitle;
	
	@NotNull
	@Column
	private int moduleNum;
	
	@NotNull
	@Column
	private String description;
	
	
	public int getIdNum() { return idNum; }
	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}
	
	
	public String getCourse() { return course; }
	public void setCourse(String course) {
		this.course = course;
	}
	
	
	public int getPartNum() { return partNum; }
	public void setPartNum(int partNum) {
		this.partNum = partNum;
	}
	
	
	public String getPartTitle() { return partTitle; }
	public void setPartTitle(String partTitle) {
		this.partTitle = partTitle;
	}
	
	
	public int getModuleNum() { return moduleNum; }
	public void setModuleNum(int moduleNum) {
		this.moduleNum = moduleNum;
	}
	
	
	public String getDescription() { return description; }
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Module() { }
	
	public Module(int idNum) {
		this.idNum = idNum;
	}
	
	public Module( String course, int partNum, String partTitle, int moduleNum, String description) {
		this.course = course;
		this.partNum = partNum;
		this.partTitle = partTitle;
		this.moduleNum = moduleNum;
		this.description = description;
	}
}
