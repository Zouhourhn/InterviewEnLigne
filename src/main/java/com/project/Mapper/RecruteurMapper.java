package com.project.Mapper;

import org.modelmapper.ModelMapper;

import com.project.Dto.RecruteurDTO;
import com.project.Model.Recruteur;

public class RecruteurMapper {
	private static final ModelMapper modelMapper= new ModelMapper();

	public static RecruteurDTO convertToDto(Recruteur recruteur)
	{
		return modelMapper.map(recruteur, RecruteurDTO.class);
	}
	public static Recruteur convertToEntity(RecruteurDTO recruteurDTO)
	{
		return modelMapper.map(recruteurDTO, Recruteur.class);
	}
}
