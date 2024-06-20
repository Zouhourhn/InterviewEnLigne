package com.project.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.project.Dto.AdminDTO;
import com.project.Mapper.AdminMapper;
import com.project.Model.Admin;

import com.project.Repository.AdminRepository;

@Service
public class AdminServiceImplement implements AdminService {
	
	private AdminRepository adminRepository;

	@Override
	public Page<AdminDTO> getAllAdmin(Pageable pageable) {
		Page<Admin> admins=adminRepository.findAll(pageable);
		return admins.map(AdminMapper::convertToDto);

	}

	@Override
	public AdminDTO addOneAdmin(AdminDTO admin) {
		return AdminMapper.convertToDto(adminRepository.save(AdminMapper.convertToEntity(admin)));

		}

	@Override
	public void deleteOneAdmin(long id) {
		adminRepository.deleteById(id);
		
	}

	@Override
	public Page<AdminDTO> getAllAdmin(java.awt.print.Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	


}
