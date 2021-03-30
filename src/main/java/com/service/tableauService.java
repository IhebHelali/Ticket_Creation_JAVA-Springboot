package com.service;

import java.util.List;

import com.entities.tableau;
import com.entities.utilisateur;

public interface tableauService {
	public List<tableau> getTableaux();
	public tableau getTableau(int id);
	public void saveOrUpadateTableau(tableau tableau);
	public void deleteTableau(int id);


}
