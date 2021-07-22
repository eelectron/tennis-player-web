package io.educative.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import io.educative.entity.Athlete;

@Controller
@RequestMapping("/player")
public class AthleteController {
	// method to handle /showPlayerForm
	@RequestMapping("/showPlayerForm")
	public String showForm(Model model) {
		model.addAttribute("athlete", new Athlete());
		return "add-player-form";
	}
	
	
	//method to handle /processPlayerForm
	@RequestMapping("/processPlayerForm")
	public String processForm(@Valid @ModelAttribute("athlete") Athlete myAthlete, BindingResult result){
		if(result.hasErrors()) {
			System.out.println("Binding result :" + result);
			return "add-player-form";
		}
		else {
			return "player-confirmation";
		}
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, editor);
	}
}