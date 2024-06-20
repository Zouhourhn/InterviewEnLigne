package com.project.Dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class UtilisateurDTO extends BaseDTO {
	@NotBlank
	private String nom;
	@NotBlank
	private String prenom;
	@Positive
	@Min(value = 18)
	private int age;
	@Email
	@NotBlank
	private String email;
	@NotBlank
	@Size(min = 6,max = 20)
	private String mdp;
	@JsonIgnoreProperties("utilisateur")
    private List<CandidatureDTO> candidatures;
	@JsonIgnoreProperties("utilisateur")
	private List<CurriculumDTO> curriculums;
	@JsonIgnoreProperties("utilisateur")
	private List<CompetenceDTO> competences;
	
}
