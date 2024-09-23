package com.nc13.moviemates.service;

import com.nc13.moviemates.component.model.MovieModel;
import com.nc13.moviemates.entity.MovieEntity;

import java.util.List;
import java.util.Optional;

public interface MovieService {

    List<MovieEntity> findAll();

    Boolean save(MovieModel movie);

    Optional<MovieEntity> findById(Long id);

    Boolean existsById(Long id);

    Long count();

    Boolean deleteById(Long id);


    void crawlAndSaveMovies(String url);
}
