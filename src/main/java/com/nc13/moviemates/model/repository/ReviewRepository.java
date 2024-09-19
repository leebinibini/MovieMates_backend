package com.nc13.moviemates.model.repository;

import com.nc13.moviemates.model.entity.ReviewEntity;
import com.nc13.moviemates.model.querydsl.ReviewQueryDSL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<ReviewEntity, Long>, ReviewQueryDSL {
}