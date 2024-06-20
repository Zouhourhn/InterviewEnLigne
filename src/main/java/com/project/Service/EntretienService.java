package com.project.Service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.project.Dto.EntretienDTO;



public interface EntretienService {

	public Page<EntretienDTO> getAllEntretien (java.awt.print.Pageable pageable);
	public EntretienDTO addOneEntretien(EntretienDTO entretien);
	public void deleteOneEntretien(long id);
	Page<EntretienDTO> getAllEntretien(Pageable pageable);
	
}
