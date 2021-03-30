package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.entities.utilisateur;


public interface utilisateurService {
	public List<utilisateur> getUtilisateurs();
	public utilisateur getUtilisateur(int id);
	public void saveOrUpadateUtilisateur(utilisateur user);
	public void deleteUtilisateur(int id);


}
