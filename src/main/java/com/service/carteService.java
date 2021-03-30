package com.service;

import java.util.List;

import com.entities.carte;

public interface carteService {
	public List<carte> getCartes();
	public carte getCarte(int id);
	public void saveOrUpadateCarte(carte carte);
	public void deleteCarte(int id);

}
