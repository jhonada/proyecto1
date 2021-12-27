package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AspectPoint;

@Repository
public interface PointCut extends JpaRepository<AspectPoint, Long>{
	
	Optional<AspectPoint> findById(Long id);

}
