package com.project.Mapper;

import org.modelmapper.ModelMapper;

import com.project.Dto.CurriculumDTO;
import com.project.Model.Curriculum;

public class CurriculumMapper {
	private static final ModelMapper modelMapper= new ModelMapper();

	public static CurriculumDTO convertToDto(Curriculum curriculum)
	{
		return modelMapper.map(curriculum, CurriculumDTO.class);
	}
	public static Curriculum convertToEntity(CurriculumDTO curriculumDTO)
	{
		return modelMapper.map(curriculumDTO, Curriculum.class);
	}
}
