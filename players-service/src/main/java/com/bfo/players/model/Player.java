package com.bfo.players.model;

public class Player {
	
	private int id;
	private String name;
	
	public Player(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
