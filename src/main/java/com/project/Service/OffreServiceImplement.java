package com.project.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.project.Dto.OffreDTO;
import com.project.Mapper.OffreMapper;
import com.project.Model.Offre;
import com.project.Repository.OffreRepository;

@Service
public class OffreServiceImplement implements OffreService {
	private OffreRepository offreRepository;


	@Override
	public OffreDTO addOneOffre(OffreDTO offre) {
		return OffreMapper.convertToDto(offreRepository.save(OffreMapper.convertToEntity(offre)));
	}

	@Override
	public void deleteOneOffre(long id) {
		offreRepository.deleteById(id);
	}

	@Override
	public java.util.Optional<OffreDTO> findOneOffre(long id) {
		return offreRepository.findById(id).map(OffreMapper::convertToDto);
	}

	@Override
	public org.springframework.data.domain.Page<OffreDTO> getAllOffre(Pageable pageable) {
		Page<Offre> offres=offreRepository.findAll(pageable);
		return offres.map(OffreMapper::convertToDto);

	}

	@Override
	public Page<OffreDTO> getAllOffre(java.awt.print.Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}


	
	
	
}
