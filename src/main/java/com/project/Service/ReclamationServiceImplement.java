package com.project.Service;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.project.Dto.ReclamationDTO;
import com.project.Mapper.ReclamationMapper;
import com.project.Model.Reclamation;
import com.project.Repository.ReclamationRepository;

@Service
public class ReclamationServiceImplement implements ReclamationService {
	private ReclamationRepository reclamationRepository;

	@Override
	public ReclamationDTO addOneReclamation(ReclamationDTO reclamation) {
		return  ReclamationMapper.convertToDto(reclamationRepository.save( ReclamationMapper.convertToEntity(reclamation)));
	}

	@Override
	public void deleteOneReclamation(long id) {
		reclamationRepository.deleteById(id);		
	}

	@Override
	public Page<ReclamationDTO> getAllReclamation(org.springframework.data.domain.Pageable pageable) {
		Page<Reclamation> reclamations=reclamationRepository.findAll( pageable);
		return reclamations.map(ReclamationMapper::convertToDto);
		}

	@Override
	public Page<ReclamationDTO> getAllReclamation(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
}
