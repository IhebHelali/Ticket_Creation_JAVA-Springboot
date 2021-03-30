package com.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;




@Entity
@Table(name = "tableau")
public class tableau {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTableau;
	private int idCarte;
	
//	@ManyToMany
//    @JoinTable(name = "utilisateur_tableau", joinColumns = @JoinColumn(name = "idTableau"), inverseJoinColumns = @JoinColumn(name = "idUser"))
//	private Collection<utilisateur> utilisateurs;

	
	public tableau() {
		// TODO Auto-generated constructor stub
	}
	public tableau(int idCarte) {
		this.idCarte = idCarte;
	}
	public int getIdTableau() {
		return idTableau;
	}
	public void setIdTableau(int idTableau) {
		this.idTableau = idTableau;
	}
	public int getIdCarte() {
		return idCarte;
	}
	public void setIdCarte(int idCarte) {
		this.idCarte = idCarte;
	}

	
	
}
