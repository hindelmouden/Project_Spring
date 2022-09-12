package com.crud.api.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.crud.api.entity.EtudiantEntity;

@Repository
public interface EtudiantRepository extends JpaRepository<EtudiantEntity, Long>{
	
	
	@Query("SELECT e FROM EtudiantEntity e WHERE e.name = :name")
	EtudiantEntity getEtudiantByName(String name);

}
