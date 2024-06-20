package com.project.Service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.project.Dto.CandidatureDTO;
import com.project.Mapper.CandidatureMapper;
import com.project.Model.Candidature;
import com.project.Repository.CandidatureRepository;


@Service
public class CandidatureServiceImplement implements CandidatureService{
	private CandidatureRepository candidatureRepository;

	

	@Override
	public CandidatureDTO addOneCandidature(CandidatureDTO candidature) {
		return CandidatureMapper.convertToDto(candidatureRepository.save(CandidatureMapper.convertToEntity(candidature)));

	}

	@Override
	public void deleteOneCandidature(long id) {
		candidatureRepository.deleteById(id);
	
	}

	@Override
	public Page<CandidatureDTO> getAllCandidature(Pageable pageable) {
		Page<Candidature> candidatures=candidatureRepository.findAll(pageable);
		return candidatures.map(CandidatureMapper::convertToDto);

	}

	@Override
	public Page<CandidatureDTO> getAllCandidature(java.awt.print.Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
