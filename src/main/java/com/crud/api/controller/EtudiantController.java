package com.crud.api.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crud.api.entity.EtudiantEntity;
import com.crud.api.service.EtudiantService;

@RequestMapping("/api")
@RestController
public class EtudiantController {
	
	public static final Logger logger = LoggerFactory.getLogger(EtudiantController.class);

	@Autowired
	private EtudiantService etudiantService;

	/**
	 *  get all etudians
	 * @return List<EtudiantEntity>
	 * @author hind
	 */
	@GetMapping(value = "/findAll")
	public List<EtudiantEntity> getAllEtudiant() {
		logger.info("GET ALL ETUDINTS FROM DATABASE");
		return etudiantService.getAllEtudiant();
	}

	/**
	 * 
	 * @param fullname
	 * @return EtudiantEntity
	 * @author hind
	 */
	@GetMapping(value = "/findByName/{name}")
	public EtudiantEntity findByName(@PathVariable(name = "name") String fullname) {
		return etudiantService.getEtudiantByName(fullname);
	}
	
	@PostMapping(value = "/addEtudiant")
	public EtudiantEntity addEtudiant(@RequestBody EtudiantEntity etudiantEntity) {
		return etudiantService.addEtudiant(etudiantEntity);
	}
	
	@PutMapping(value = "/updateEtudiant")
	public EtudiantEntity updateEtudiant(@RequestBody EtudiantEntity etudiantEntity) {
		return etudiantService.updateEtudiant(etudiantEntity);
	}

	@DeleteMapping(value = "/delete/{id}")
	public void deleteById(@PathVariable Long id) {
		etudiantService.deleteEtudintById(id);
	}

	@DeleteMapping(value = "/delete")
	public void deleteByID(@RequestParam Long id) {
		etudiantService.deleteEtudintById(id);
	}

}
