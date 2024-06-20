package com.project.Service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.project.Dto.AdminDTO;



public interface AdminService {

	public Page<AdminDTO> getAllAdmin (java.awt.print.Pageable pageable);
	public AdminDTO addOneAdmin(AdminDTO admin);
	public void deleteOneAdmin(long id);
	Page<AdminDTO> getAllAdmin(Pageable pageable);

}
