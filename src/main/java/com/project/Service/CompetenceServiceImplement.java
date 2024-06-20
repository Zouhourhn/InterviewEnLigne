package com.project.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.project.Dto.CompetenceDTO;
import com.project.Mapper.CompetenceMapper;
import com.project.Model.Competence;

import com.project.Repository.CompetenceRepository;


@Service

public class CompetenceServiceImplement implements CompetenceService {
	private CompetenceRepository competenceRepository;


	@Override
	public CompetenceDTO addOneCompetence(CompetenceDTO competence) {
		return CompetenceMapper.convertToDto(competenceRepository.save(CompetenceMapper.convertToEntity(competence)));

	}

	@Override
	public CompetenceDTO getOneCompetence(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteOneCompetence(long id) {
		competenceRepository.deleteById(id);	
		
	}

	@Override
	public Page<CompetenceDTO> getAllCompetence(Pageable pageable) {
		Page<Competence> competences=competenceRepository.findAll(pageable);
		return competences.map(CompetenceMapper::convertToDto);

	}

	@Override
	public Page<CompetenceDTO> getAllCompetence(java.awt.print.Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
