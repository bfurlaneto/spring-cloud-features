package com.bfo.players.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bfo.players.model.Player;

@RestController
@RequestMapping("/players")
public class PlayersController {
	
private List<Player> players = this.createPlayersArray();
	
	@GetMapping("")
	public List<Player> getGames() {
		return players;
	}
	
	@GetMapping("/{playerId}")
	public Player getPlayerById(@PathVariable int playerId) {
		return players.stream()
				.filter(player -> player.getId() == playerId)
				.findFirst()
				.orElse(null);
		
	}
	
	private List<Player> createPlayersArray() {
		return Arrays.asList(new Player(1,"P1"),
				new Player(2,"P2"),
				new Player(3,"P3"));
	}


}
