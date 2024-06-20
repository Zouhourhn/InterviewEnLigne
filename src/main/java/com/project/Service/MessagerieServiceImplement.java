package com.project.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.project.Dto.MessagerieDTO;
import com.project.Mapper.MessagerieMapper;
import com.project.Model.Messagerie;

import com.project.Repository.MessagerieRepository;

@Service
public class MessagerieServiceImplement implements MessagerieService {
	private MessagerieRepository messagerieRepository;

	@Override
	public MessagerieDTO addOneMessagerie(MessagerieDTO messagerie) {
		return MessagerieMapper.convertToDto(messagerieRepository.save(MessagerieMapper.convertToEntity(messagerie)));
	}

	@Override
	public void deleteOneMessagerie(long id) {
		messagerieRepository.deleteById(id);	
	}

	@Override
	public org.springframework.data.domain.Page<MessagerieDTO> getAllMessagerie(Pageable pageable) {
		Page<Messagerie> messageries=messagerieRepository.findAll(pageable);
		return messageries.map(MessagerieMapper::convertToDto);

	}

	@Override
	public Page<MessagerieDTO> getAllMessagerie(java.awt.print.Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
