package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.utilisateurRepository;
import com.entities.utilisateur;

@Service
public class utilisateurServiceImpl implements utilisateurService{
	@Autowired
	utilisateurRepository utilisateurRepository;

	@Override
	public List<utilisateur> getUtilisateurs() {
		return utilisateurRepository.findAll();
	}

	@Override
	public utilisateur getUtilisateur(int id) {
		return utilisateurRepository.getOne(id);

			}

	@Override
	public void saveOrUpadateUtilisateur(utilisateur user) {
		utilisateurRepository.save(user);
		
	}

	@Override
	public void deleteUtilisateur(int id) {
utilisateurRepository.deleteById(id);	
	}
	

}
