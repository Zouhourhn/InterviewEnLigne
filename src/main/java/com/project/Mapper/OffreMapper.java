package com.project.Mapper;

import org.modelmapper.ModelMapper;

import com.project.Dto.OffreDTO;
import com.project.Model.Offre;

public class OffreMapper {
	private static final ModelMapper modelMapper= new ModelMapper();

	public static OffreDTO convertToDto(Offre offre)
	{
		return modelMapper.map(offre, OffreDTO.class);
	}
	public static Offre convertToEntity(OffreDTO offreDTO)
	{
		return modelMapper.map(offreDTO, Offre.class);
	}
}
