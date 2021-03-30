package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.carteRepository;
import com.entities.carte;

@Service
public class carteServiceImpl implements carteService {
	
	@Autowired
	carteRepository carteRepository;
	
	@Override
	public List<carte> getCartes() {
		return carteRepository.findAll();
	}

	@Override
	public carte getCarte(int id) {
		return carteRepository.getOne(id);
	}

	@Override
	public void saveOrUpadateCarte(carte carte) {
		carteRepository.save(carte);		
	}

	@Override
	public void deleteCarte(int id) {
		carteRepository.deleteById(id);	
	}

	
	
}
