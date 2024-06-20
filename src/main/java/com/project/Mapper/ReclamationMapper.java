package com.project.Mapper;

import org.modelmapper.ModelMapper;

import com.project.Dto.ReclamationDTO;
import com.project.Model.Reclamation;

public class ReclamationMapper {
	private static final ModelMapper modelMapper= new ModelMapper();

	public static ReclamationDTO convertToDto(Reclamation reclamation)
	{
		return modelMapper.map(reclamation, ReclamationDTO.class);
	}
	public static Reclamation convertToEntity(ReclamationDTO reclamationDTO)
	{
		return modelMapper.map(reclamationDTO, Reclamation.class);
	}
}
