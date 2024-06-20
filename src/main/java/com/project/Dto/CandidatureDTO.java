package com.project.Dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class CandidatureDTO  extends BaseDTO {
	@NotBlank
	private String titre ;
	@NotBlank
	private String prenom ;
	@NotBlank
	private String etat;
	@JsonIgnoreProperties("candidature")
    private EntretienDTO entretien;
	@JsonIgnoreProperties("candidature")
    private OffreDTO offre;
	@JsonIgnoreProperties("candidature")
    private UtilisateurDTO utilisateur;
}
