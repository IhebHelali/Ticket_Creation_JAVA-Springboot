package com.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;





@Entity
@Table(name = "carte")
public class carte {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCarte;
	private String texte;
	private String cout;
	private String membre;
	private String type;

//	@ManyToOne
//	@JoinColumn(name = "idTableau")
//	private tableau tableau;

	public carte() {
		// TODO Auto-generated constructor stub
	}

	public carte(String texte, String cout, String membre, String type) {
		this.texte = texte;
		this.cout = cout;
		this.membre = membre;
		this.type = type;
	}

	public int getIdCarte() {
		return idCarte;
	}

	public void setIdCarte(int idCarte) {
		this.idCarte = idCarte;
	}

	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}

	public String getCout() {
		return cout;
	}

	public void setCout(String cout) {
		this.cout = cout;
	}

	public String getMembre() {
		return membre;
	}

	public void setMembre(String membre) {
		this.membre = membre;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
