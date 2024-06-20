package com.project.Model;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Competence extends BaseEntity {
	@Column(nullable = false)
	private String titre ;

	@ManyToOne(optional = false,fetch = FetchType.EAGER)

	private Utilisateur utilisateur;
}
