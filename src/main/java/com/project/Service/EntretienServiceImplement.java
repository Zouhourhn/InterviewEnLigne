package com.project.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.project.Dto.EntretienDTO;
import com.project.Mapper.EntretienMapper;
import com.project.Model.Entretien;
import com.project.Repository.EntretienRepository;

@Service
public class EntretienServiceImplement implements EntretienService{
	private EntretienRepository entretienRepository;

	@Override
	public EntretienDTO addOneEntretien(EntretienDTO entretien) {
		return EntretienMapper.convertToDto(entretienRepository.save(EntretienMapper.convertToEntity(entretien)));
		}

	@Override
	public void deleteOneEntretien(long id) {
		entretienRepository.deleteById(id);	
	
	}

	@Override
	public Page<EntretienDTO> getAllEntretien(Pageable pageable) {
		Page<Entretien> entretiens=entretienRepository.findAll(pageable);
		return entretiens.map(EntretienMapper::convertToDto);
	}

	@Override
	public Page<EntretienDTO> getAllEntretien(java.awt.print.Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
