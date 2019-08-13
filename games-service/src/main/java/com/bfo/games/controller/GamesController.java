package com.bfo.games.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bfo.games.model.Game;

@RestController
@RequestMapping("/games")
public class GamesController {
	
	private List<Game> games = this.createGamesArray();
	
	@GetMapping("")
	public List<Game> getGames() {
		return games;
	}
	
	@GetMapping("/{gameId}")
	public Game getGameById(@PathVariable int gameId) {
		return games.stream()
				.filter(game -> game.getId() == gameId)
				.findFirst()
				.orElse(null);
		
	}
	
	private List<Game> createGamesArray() {
		return Arrays.asList(new Game(1,"Loco Loco", 2018),
				new Game(2,"Dino Crisis", 1999),
				new Game(3,"GTA V", 2013));
	}

}
