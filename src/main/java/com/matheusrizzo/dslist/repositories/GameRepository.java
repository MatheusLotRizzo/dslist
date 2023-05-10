package com.matheusrizzo.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusrizzo.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
