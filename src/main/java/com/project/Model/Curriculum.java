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
public class Curriculum extends BaseEntity {
	@Column(nullable = false)
	private String url ;
	@Column(nullable = false)
	private String titre ;
	@Column(nullable = false)
	private String visibilité ;
	
	@ManyToOne(optional = false,fetch = FetchType.EAGER)

	private Utilisateur utilisateur;
}
