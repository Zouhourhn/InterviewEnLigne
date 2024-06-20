package com.project.Mapper;

import org.modelmapper.ModelMapper;

import com.project.Dto.MessagerieDTO;
import com.project.Model.Messagerie;

public class MessagerieMapper {
	private static final ModelMapper modelMapper= new ModelMapper();

	public static MessagerieDTO convertToDto(Messagerie messagerie)
	{
		return modelMapper.map(messagerie, MessagerieDTO.class);
	}
	public static Messagerie convertToEntity(MessagerieDTO messagerieDTO)
	{
		return modelMapper.map(messagerieDTO, Messagerie.class);
	}
}
