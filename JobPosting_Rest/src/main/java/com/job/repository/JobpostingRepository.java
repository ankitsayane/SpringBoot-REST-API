package com.job.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.job.entity.JobPosting;

public interface JobpostingRepository extends JpaRepository<JobPosting, Long>{

}
