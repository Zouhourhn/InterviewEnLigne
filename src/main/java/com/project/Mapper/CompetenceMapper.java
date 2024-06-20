package com.project.Mapper;

import org.modelmapper.ModelMapper;

import com.project.Dto.CompetenceDTO;
import com.project.Model.Competence;

public class CompetenceMapper {
	private static final ModelMapper modelMapper= new ModelMapper();

	public static CompetenceDTO convertToDto(Competence competence)
	{
		return modelMapper.map(competence, CompetenceDTO.class);
	}
	public static Competence convertToEntity(CompetenceDTO competenceDTO)
	{
		return modelMapper.map(competenceDTO, Competence.class);
	}
}
