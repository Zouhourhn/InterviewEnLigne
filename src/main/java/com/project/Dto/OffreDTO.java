package com.project.Dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OffreDTO  extends BaseDTO {
	@NotBlank
	private String titre ;
	@NotBlank
	private String description ;
	@NotBlank
	private String compétences ;

	 @JsonIgnoreProperties("offre")
	private List<CandidatureDTO> condidatures;
	 @JsonIgnoreProperties("offre")
	private CategorieDTO categorie;
}
