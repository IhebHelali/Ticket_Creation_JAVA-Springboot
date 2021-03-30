package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entities.utilisateur;
import com.service.utilisateurService;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class utilisateurController {
	@Autowired
	utilisateurService utilisateurService;
	
	@GetMapping("/utilisateurs")
	public List<utilisateur> getUtilisateurs() {
		return utilisateurService.getUtilisateurs();
	}

	@PostMapping("/utilisateurs")
	public void addUtilisateur(@RequestBody utilisateur user) {
		utilisateurService.saveOrUpadateUtilisateur(user);
		}

	@GetMapping("/utilisateurs/{id}")
	public utilisateur getUtilisateur(@PathVariable int id) {
		return utilisateurService.getUtilisateur(id);
	}

	@PutMapping("/utilisateurs")
	public void updateUtilisateur(@RequestBody utilisateur user){
		utilisateurService.saveOrUpadateUtilisateur(user);
	}

	@DeleteMapping("/utilisateurs/{id}")
	public void deleteUtilisateur(@PathVariable int id) {
		utilisateurService.deleteUtilisateur(id);
		}

	


}
