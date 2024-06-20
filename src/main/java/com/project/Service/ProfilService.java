package com.project.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.project.Dto.ProfilDTO;


public interface ProfilService {
	
	public Page<ProfilDTO> getAllProfil (Pageable pageable);
	public ProfilDTO addOneProfil(ProfilDTO profil);
	public void deleteOneProfil(long id);
	Page<ProfilDTO> getAllProfil(java.awt.print.Pageable pageable);
	
}
