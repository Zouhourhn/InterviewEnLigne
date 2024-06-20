package com.project.Service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.project.Dto.CategorieDTO;



public interface CategorieService {
	
	public Page<CategorieDTO> getAllCategorie (java.awt.print.Pageable pageable);
	public CategorieDTO addOneCategorie(CategorieDTO categorie);
	public void deleteOneCategorie(long id);
	Page<CategorieDTO> getAllCategorie(Pageable pageable);
	
}
