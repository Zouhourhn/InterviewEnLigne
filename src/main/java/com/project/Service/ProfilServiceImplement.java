package com.project.Service;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.project.Dto.ProfilDTO;
import com.project.Mapper.ProfilMapper;
import com.project.Model.Profil;
import com.project.Repository.ProfilRepository;


@Service
public class ProfilServiceImplement implements ProfilService {
	private ProfilRepository profilRepository;


	@Override
	public ProfilDTO addOneProfil(ProfilDTO profil) {
			return  ProfilMapper.convertToDto(profilRepository.save( ProfilMapper.convertToEntity(profil)));

	}

	@Override
	public void deleteOneProfil(long id) {
		profilRepository.deleteById(id);
		
	}

	@Override
	public Page<ProfilDTO> getAllProfil(org.springframework.data.domain.Pageable pageable) {
		Page<Profil> profils=profilRepository.findAll(pageable);
		return profils.map(ProfilMapper::convertToDto);
	}

	@Override
	public Page<ProfilDTO> getAllProfil(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
