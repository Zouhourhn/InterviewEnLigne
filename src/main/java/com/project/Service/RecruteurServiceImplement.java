package com.project.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.project.Dto.RecruteurDTO;
import com.project.Mapper.RecruteurMapper;
import com.project.Model.Recruteur;
import com.project.Repository.RecruteurRepository;

@Service
public class RecruteurServiceImplement implements RecruteurService {
	private RecruteurRepository recruteurRepository;
	
	@Override
	public RecruteurDTO addOneRecruteur(RecruteurDTO recruteur) {
		return  RecruteurMapper.convertToDto(recruteurRepository.save( RecruteurMapper.convertToEntity(recruteur)));
		}
	@Override
	public void deleteOneRecruteur(long id) {
		recruteurRepository.deleteById(id);
		
		
	}
	@Override
	public Page<RecruteurDTO> getAllRecruteurs(Pageable pageable) {
		Page<Recruteur> recruteurs=recruteurRepository.findAll(pageable);
		return recruteurs.map(RecruteurMapper::convertToDto);

	}
	@Override
	public Page<RecruteurDTO> getAllRecruteur(java.awt.print.Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

}
