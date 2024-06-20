package com.project.Mapper;

import org.modelmapper.ModelMapper;

import com.project.Dto.CategorieDTO;
import com.project.Model.Categorie;

public class CategorieMapper {
	private static final ModelMapper modelMapper= new ModelMapper();

	public static CategorieDTO convertToDto(Categorie categorie)
	{
		return modelMapper.map(categorie, CategorieDTO.class);
	}
	public static Categorie convertToEntity(CategorieDTO categorieDTO)
	{
		return modelMapper.map(categorieDTO, Categorie.class);
	}
}
