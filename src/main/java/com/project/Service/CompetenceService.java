package com.project.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.project.Dto.CompetenceDTO;

public interface CompetenceService {
	
	public Page<CompetenceDTO> getAllCompetence (Pageable pageable);
	public CompetenceDTO addOneCompetence(CompetenceDTO competence);
	public CompetenceDTO getOneCompetence(long id);
	public void deleteOneCompetence(long id);
	Page<CompetenceDTO> getAllCompetence(java.awt.print.Pageable pageable);
}
