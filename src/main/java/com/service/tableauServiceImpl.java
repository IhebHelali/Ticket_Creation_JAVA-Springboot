package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.tableauRepository;

import com.entities.tableau;

@Service
public class tableauServiceImpl implements tableauService {
	@Autowired
	tableauRepository tableauRepository;

	@Override
	public List<tableau> getTableaux() {
		return tableauRepository.findAll();
	}

	@Override
	public tableau getTableau(int id) {
		return tableauRepository.getOne(id);
	}

	@Override
	public void saveOrUpadateTableau(tableau tableau) {
		tableauRepository.save(tableau);
	}

	@Override
	public void deleteTableau(int id) {
		tableauRepository.deleteById(id);
	}

}
