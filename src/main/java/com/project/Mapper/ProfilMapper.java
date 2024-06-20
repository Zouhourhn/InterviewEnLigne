package com.project.Mapper;

import org.modelmapper.ModelMapper;

import com.project.Dto.ProfilDTO;
import com.project.Model.Profil;

public class ProfilMapper {
	private static final ModelMapper modelMapper= new ModelMapper();

	public static ProfilDTO convertToDto(Profil profil)
	{
		return modelMapper.map(profil, ProfilDTO.class);
	}
	public static Profil convertToEntity(ProfilDTO profilDTO)
	{
		return modelMapper.map(profilDTO, Profil.class);
	}
}
