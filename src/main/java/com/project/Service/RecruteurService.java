package com.project.Service;


import java.awt.print.Pageable;

import org.springframework.data.domain.Page;

import com.project.Dto.RecruteurDTO;


public interface RecruteurService {

	public Page<RecruteurDTO> getAllRecruteur  (Pageable pageable);
	public RecruteurDTO addOneRecruteur(RecruteurDTO recruteur);
	public void deleteOneRecruteur(long id);
	Page<RecruteurDTO> getAllRecruteurs(org.springframework.data.domain.Pageable pageable);
	

	

}
