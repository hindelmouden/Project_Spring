package com.crud.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.api.entity.EtudiantEntity;
import com.crud.api.entity.repository.EtudiantRepository;
import com.crud.api.service.EtudiantService;

@Service
public class EtudiantServiceInmp implements EtudiantService {

	@Autowired
	private EtudiantRepository etudiantRepository;

	@Override
	public List<EtudiantEntity> getAllEtudiant() {
		
		List<EtudiantEntity> etudiants = null;
		try {
			etudiants = etudiantRepository.findAll();
			
		} catch (Exception e) {
			 
		}
		return etudiants;
	}

	@Override
	public void deleteEtudintById(long id) {
		etudiantRepository.deleteById(id);	
	}

	@Override
	public EtudiantEntity getEtudiantByName(String name) {
		 
		
		return etudiantRepository.getEtudiantByName(name);
	}

	@Override
	public EtudiantEntity addEtudiant(EtudiantEntity etudiantEntity) {
	
		return etudiantRepository.save(etudiantEntity);
	}

	@Override
	public EtudiantEntity updateEtudiant(EtudiantEntity etudiantEntity) {
		return etudiantRepository.save(etudiantEntity);
	}

}
