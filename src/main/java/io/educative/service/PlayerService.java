package io.educative.service;

import java.util.Arrays;
import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import io.educative.entity.Player;

@Service
public class PlayerService {
	private List<Player> players = Arrays.asList(
			new Player(1, "Djokovic", "Serbia", new Date(1987-05-22), 81),
			new Player(2, "Monfils", "France", new Date(1986-07-01), 10),
			new Player(3, "Isner", "USA", new Date(1985-04-26), 15)
			); 
	
	public Player getPlayerByName(String playerName) {
		// TODO Auto-generated method stub
		
		return players.stream().filter(p -> p.getName().equals(playerName)).findFirst().get();
	}
}