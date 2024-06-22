package com.job.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "job_posting")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class JobPosting {
// Job title, company name, location, description, requirements, salary, and posting date
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long jobid;
	
	private String jobtitle;
	
	private String comname;
	
	private String location;
	
	private String description;
	
	private String requirement;
	
	private double salary;
	
	private LocalDate postingdate;

	public JobPosting(String jobtitle, String comname, String location, String description, String requirement,
			double salary, LocalDate postingdate) {
		super();
		this.jobtitle = jobtitle;
		this.comname = comname;
		this.location = location;
		this.description = description;
		this.requirement = requirement;
		this.salary = salary;
		this.postingdate = postingdate;
	}
	
}
