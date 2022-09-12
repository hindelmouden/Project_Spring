package com.crud.api.service;

import java.util.List;

import com.crud.api.entity.EtudiantEntity;

public interface EtudiantService {
	
	public List<EtudiantEntity> getAllEtudiant();
	
	public void deleteEtudintById(long id);

	public EtudiantEntity getEtudiantByName(String name);
	
	public EtudiantEntity addEtudiant(EtudiantEntity etudiantEntity);
	
	public EtudiantEntity updateEtudiant(EtudiantEntity etudiantEntity);
}
