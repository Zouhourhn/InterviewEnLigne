package com.project.Dto;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompetenceDTO  extends BaseDTO {
	@NotBlank
	private String titre ;
	 @JsonIgnoreProperties("Competence")
	private UtilisateurDTO utilisateur;
}
