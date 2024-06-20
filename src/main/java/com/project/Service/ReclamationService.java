package com.project.Service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import com.project.Dto.ReclamationDTO;


public interface ReclamationService {
	
	public Page<ReclamationDTO> getAllReclamation (Pageable pageable);
	public ReclamationDTO addOneReclamation(ReclamationDTO reclamation);
	public void deleteOneReclamation(long id);
	Page<ReclamationDTO> getAllReclamation(java.awt.print.Pageable pageable);

}
