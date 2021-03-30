package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.tableau;
import com.entities.utilisateur;

public interface tableauRepository extends JpaRepository<tableau, Integer>{

}
