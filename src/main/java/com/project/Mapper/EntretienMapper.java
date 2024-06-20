package com.project.Mapper;

import org.modelmapper.ModelMapper;

import com.project.Dto.EntretienDTO;
import com.project.Model.Entretien;

public class EntretienMapper {
	private static final ModelMapper modelMapper= new ModelMapper();

	public static EntretienDTO convertToDto(Entretien entretien)
	{
		return modelMapper.map(entretien, EntretienDTO.class);
	}
	public static Entretien convertToEntity(EntretienDTO entretienDTO)
	{
		return modelMapper.map(entretienDTO, Entretien.class);
	}
}
