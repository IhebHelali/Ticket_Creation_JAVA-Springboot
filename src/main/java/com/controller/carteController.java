package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entities.carte;
import com.service.carteService;

@RestController
@RequestMapping("/api")

public class carteController {
	@Autowired
	carteService carteService;

	@GetMapping("/cartes")
	public List<carte> getCartes() {
		return carteService.getCartes();
	}

	@PostMapping("/cartes")
	public void addCarte(@RequestBody carte carte) {
		carteService.saveOrUpadateCarte(carte);
		}

	@GetMapping("/cartes/{id}")
	public carte getcarte(@PathVariable int id) {
		return carteService.getCarte(id);
	}

	@PutMapping("/cartes")
	public void updateCarte(@RequestBody carte carte){
		carteService.saveOrUpadateCarte(carte);
	}

	@DeleteMapping("/cartes/{id}")
	public void deleteCarte(@PathVariable int id) {
		carteService.deleteCarte(id);
		}



}
