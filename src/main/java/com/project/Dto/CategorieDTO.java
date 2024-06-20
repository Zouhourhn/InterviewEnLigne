package com.project.Dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategorieDTO  extends BaseDTO {
	@NotBlank
	private String titre ;

	 @JsonIgnoreProperties("categorie")
	private List<OffreDTO> offres;
}
