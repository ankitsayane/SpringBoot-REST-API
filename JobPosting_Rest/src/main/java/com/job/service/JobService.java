package com.job.service;

import java.util.List;

import com.job.dto.ApiResponse;
import com.job.entity.JobPosting;

public interface JobService {

	List<JobPosting> getJob();

	JobPosting addNewJob(JobPosting job);

	JobPosting getJobPostingById(Long jobId);

	ApiResponse updateJobById(Long jobId, JobPosting job);

	ApiResponse removeJobPosting(Long jobId);

}
