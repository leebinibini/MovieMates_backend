package com.nc13.moviemates.model.repository;

import com.nc13.moviemates.model.entity.WishEntity;
import com.nc13.moviemates.model.querydsl.WishQueryDSL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishRepository extends JpaRepository<WishEntity, Long>, WishQueryDSL {
}