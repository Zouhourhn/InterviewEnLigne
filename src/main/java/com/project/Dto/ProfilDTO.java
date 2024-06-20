package com.project.Dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ProfilDTO extends BaseDTO {
	@NotBlank
	private String photo ;
	@NotBlank
	@Size(min = 8,max = 16)
	private String telephone ;
	@NotBlank
	private String adresse ;
	@NotBlank
	private String presentation ;
	 @JsonIgnoreProperties("profil")
	private UtilisateurDTO utilisateur;
}
