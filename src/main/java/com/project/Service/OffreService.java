package com.project.Service;


import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.project.Dto.OffreDTO;


public interface OffreService {
	
	public Page<OffreDTO> getAllOffre (Pageable pageable);
	public OffreDTO addOneOffre(OffreDTO offre);
	public void deleteOneOffre(long id);
	public Optional<OffreDTO> findOneOffre(long id);
	Page<OffreDTO> getAllOffre(java.awt.print.Pageable pageable);
	
}
