package com.project.Mapper;

import org.modelmapper.ModelMapper;

import com.project.Dto.AdminDTO;
import com.project.Model.Admin;

public class AdminMapper {
	private static final ModelMapper modelMapper= new ModelMapper();

	public static AdminDTO convertToDto(Admin admin)
	{
		return modelMapper.map(admin, AdminDTO.class);
	}
	public static Admin convertToEntity(AdminDTO adminDTO)
	{
		return modelMapper.map(adminDTO, Admin.class);
	}
}
