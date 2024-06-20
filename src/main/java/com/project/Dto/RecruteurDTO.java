package com.project.Dto;

import com.project.Model.Utilisateur;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RecruteurDTO  extends Utilisateur {
	@NotBlank
	private String entreprise ;
	@NotBlank
	private String grade ;
}
