package com.pkglobal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pkglobal.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

}
