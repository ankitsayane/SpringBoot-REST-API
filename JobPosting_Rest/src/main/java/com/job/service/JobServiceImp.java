package com.job.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.job.dto.ApiResponse;
import com.job.entity.JobPosting;
import com.job.exceptions.ResourceNotFoundException;
import com.job.repository.JobpostingRepository;

@Service
@Transactional
public class JobServiceImp implements JobService {

	@Autowired
	private JobpostingRepository jobRepo;
	
	@Override
	public List<JobPosting> getJob() {
		return jobRepo.findAll();
	}

	@Override
	public JobPosting addNewJob(JobPosting job) {
		return jobRepo.save(job);
	}

	@Override
	public JobPosting getJobPostingById(Long jobId) {
		return jobRepo.findById(jobId)
				.orElseThrow(()->new ResourceNotFoundException("Invalid Id"));
	}

	@Override
	public ApiResponse updateJobById(Long jobId, JobPosting job) {
		String msg = "Updation Failed";
		if(jobRepo.existsById(jobId)) {
			jobRepo.save(job);
			msg = "Updation Successful";
		}
		else {
			throw new ResourceNotFoundException("Invalid Id");
		}
		return new ApiResponse(msg);
	}

	@Override
	public ApiResponse removeJobPosting(Long jobId) {
		JobPosting jobPost = jobRepo.findById(jobId).orElseThrow(()->new ResourceNotFoundException("Invalid ID"));
		jobRepo.delete(jobPost);
		return new ApiResponse("Product Deleted with "+jobId);
	}

}
