package com.project.Dto;

import com.project.Model.Messagerie;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ReclamationDTO  extends Messagerie{
	@NotBlank
	private String objet ;

}
