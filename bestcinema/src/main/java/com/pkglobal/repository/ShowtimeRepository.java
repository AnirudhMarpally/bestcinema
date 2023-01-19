package com.pkglobal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pkglobal.entities.Showtime;

public interface ShowtimeRepository extends JpaRepository<Showtime, Integer> {

}
