package com.project.Mapper;

import org.modelmapper.ModelMapper;

import com.project.Dto.CandidatureDTO;
import com.project.Model.Candidature;

public class CandidatureMapper {

	private static final ModelMapper modelMapper= new ModelMapper();

	public static CandidatureDTO convertToDto(Candidature candidature)
	{
		return modelMapper.map(candidature, CandidatureDTO.class);
	}
	public static Candidature convertToEntity(CandidatureDTO candidatureDTO)
	{
		return modelMapper.map(candidatureDTO, Candidature.class);
	}
}
