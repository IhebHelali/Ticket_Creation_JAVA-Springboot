package com.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
@Entity
@Table(name = "utilisateur")
public class utilisateur {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idUser ;
	private String username;
	private String password;
	private String email;
	
//	@OneToMany(mappedBy="carte")
//	private Collection<carte> cartes;
//
//	@ManyToMany(mappedBy="utilisateurs")
//	private Collection<tableau> tableaux;
//	

	
	public utilisateur() {
		// TODO Auto-generated constructor stub
	}

	public utilisateur(String username, String password, String email) {
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	

}
