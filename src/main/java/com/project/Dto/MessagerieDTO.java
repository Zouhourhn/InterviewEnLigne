package com.project.Dto;


import jakarta.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class MessagerieDTO  extends BaseDTO {
	@NotBlank
	private String text;
	
	private UtilisateurDTO emetteur;
	private UtilisateurDTO recepteur;
}
