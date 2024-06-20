package com.project.Service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.project.Dto.CandidatureDTO;


public interface CandidatureService {
		
		
		public Page<CandidatureDTO> getAllCandidature (java.awt.print.Pageable pageable);
		public CandidatureDTO addOneCandidature(CandidatureDTO candidature);
		public void deleteOneCandidature(long id);
		Page<CandidatureDTO> getAllCandidature(Pageable pageable);
		
	
}
