package com.nc13.moviemates.queryDsl;

import com.nc13.moviemates.entity.MovieEntity;

import java.util.List;

public interface MovieQueryDSL {
    List<MovieEntity> getAll();
    MovieEntity getById(Long id);
    Boolean exists(Long id);
    Long getRowCount();
}