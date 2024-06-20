package com.project.Dto;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CurriculumDTO extends BaseDTO {
	@NotBlank
	private String url ;
	@NotBlank
	private String titre ;
	@NotBlank
	private String visibilité ;
	 @JsonIgnoreProperties("Curriculum")
	private UtilisateurDTO utilisateur;
}
