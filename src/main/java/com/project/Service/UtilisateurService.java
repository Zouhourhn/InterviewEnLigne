package com.project.Service;

import java.util.Optional;

import com.project.Dto.CandidatureDTO;
import com.project.Dto.CompetenceDTO;
import com.project.Dto.CurriculumDTO;
import com.project.Dto.UtilisateurDTO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UtilisateurService {
	
	public UtilisateurDTO addOneUtilisateur(UtilisateurDTO utilisateur);
	public void deleteOneUtilisateur(long id);
	public Optional<UtilisateurDTO> findOneUtilisateur(long id);
	public UtilisateurDTO assignCandidatureToUtilisateur(long id,CandidatureDTO CandidatureDTO);
	public UtilisateurDTO assignCurriculumToUtilisateur(long id,CurriculumDTO curriculumDTO);
	public UtilisateurDTO assignCompetenceToUtilisateur(long id,CompetenceDTO competenceDTO);
	public Page<UtilisateurDTO> getAllUtilisateurs(Pageable pageable);
	
}
