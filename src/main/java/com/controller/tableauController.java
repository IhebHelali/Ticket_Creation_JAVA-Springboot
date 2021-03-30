package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entities.tableau;
import com.service.tableauService;

@RestController
@RequestMapping("/api")
public class tableauController {
@Autowired
tableauService tableauService;

@GetMapping("/tableaux")
public List<tableau> gettableaux() {
	return tableauService.getTableaux();
}

@PostMapping("/tableaux")
public void addtableau(@RequestBody tableau tableau) {
	tableauService.saveOrUpadateTableau(tableau);
	}

@GetMapping("/tableaux/{id}")
public tableau gettableau(@PathVariable int id) {
	return tableauService.getTableau(id);
}

@PutMapping("/tableaux")
public void updatetableau(@RequestBody tableau tableau){
	tableauService.saveOrUpadateTableau(tableau);
}

@DeleteMapping("/tableaux/{id}")
public void deletetableau(@PathVariable int id) {
	tableauService.deleteTableau(id);
	}




}
