package com.matheusrizzo.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheusrizzo.dslist.dto.GameMinDTO;
import com.matheusrizzo.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		/**
		 * Mesma coisa que:
		 * return gameRepository.findAll().stream().map(x -> new GameMinDTO(x)).toList();
		 */
		return gameRepository.findAll().stream().map(GameMinDTO::new).toList();
	}
}
