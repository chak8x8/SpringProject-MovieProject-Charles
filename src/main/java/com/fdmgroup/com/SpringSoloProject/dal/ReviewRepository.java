package com.fdmgroup.com.SpringSoloProject.dal;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fdmgroup.com.SpringSoloProject.model.Record;
import com.fdmgroup.com.SpringSoloProject.model.Review;


@Repository
public interface ReviewRepository extends JpaRepository<Review, Long>{

	Optional<Review> findById(Long id);
	
	@Query("SELECT r FROM Review r WHERE r.record.id =?1")
	List<Review> findByRecordId(Long recordId);
	
}