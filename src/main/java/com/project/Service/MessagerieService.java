package com.project.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.project.Dto.MessagerieDTO;


public interface MessagerieService {
	
	public Page<MessagerieDTO> getAllMessagerie (Pageable pageable);
	public MessagerieDTO addOneMessagerie(MessagerieDTO messagerie);
	public void deleteOneMessagerie(long id);
	Page<MessagerieDTO> getAllMessagerie(java.awt.print.Pageable pageable);
}
