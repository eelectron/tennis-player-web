package io.educative.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import io.educative.entity.Player;
import io.educative.service.PlayerService;

@Controller
public class PlayerController {
	@Autowired
	private PlayerService playerService;
	
	@RequestMapping("/showPlayerForm")
	public String showForm() {
		return "search-player-form";
	}
	
	@RequestMapping("/processPlayerForm")
	public String processForm(HttpServletRequest request, Model model) {
		String pName = request.getParameter("playerName");
		Player player = playerService.getPlayerByName(pName);
		model.addAttribute("name", player.getName());
		model.addAttribute("country", player.getNationality());
		model.addAttribute("dob", player.getBirthDate());
		model.addAttribute("titles", player.getTitles());
		return "player-detail";
	}
}