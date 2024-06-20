package com.project.Dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntretienDTO extends BaseDTO{
	@NotBlank
	private String titre ;
	@NotBlank
	private String debut ;
	@NotBlank
	private String type ;
	@NotBlank
	private String fin ;
	@NotBlank
	private String lieu ;
	 @JsonIgnoreProperties("entretien")
	private CandidatureDTO candidature;
}
