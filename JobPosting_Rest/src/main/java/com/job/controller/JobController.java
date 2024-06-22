package com.job.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.job.dto.ApiResponse;
import com.job.entity.JobPosting;
import com.job.service.JobService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/jobPostings")
public class JobController {

	@Autowired
	private JobService jobService;
	
	JobController(){
		System.out.println("In controller CTOR");
	}
	
	@GetMapping
	public ResponseEntity<?> getJobPosting(){
		return ResponseEntity.ok(jobService.getJob());
	}
	
	@PostMapping
	public ResponseEntity<?> addJobPosting(@RequestBody JobPosting job){
		return ResponseEntity.status(HttpStatus.CREATED).body(jobService.addNewJob(job));
	}
	
	@GetMapping("/{jobId}")
	@Operation(description = "Get JobPosting by Id")
	public ResponseEntity<?> getJobById(@PathVariable Long jobId){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(jobService.getJobPostingById(jobId));
		}catch(RuntimeException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiResponse("Invalid Id"));
		}
	}
	
	@PutMapping("/{jobId}")
	@Operation(description = "Update Product By Id")
	public ResponseEntity<?> updateJobPosting(@PathVariable Long jobId, @RequestBody JobPosting job){
		return ResponseEntity.status(HttpStatus.OK).body(jobService.updateJobById(jobId, job));
	}
	
	@DeleteMapping("/{jobId}")
	public ResponseEntity<?> deleteJobPosting(@PathVariable Long jobId){
		return ResponseEntity.status(HttpStatus.OK).body(jobService.removeJobPosting(jobId));
	}
}
