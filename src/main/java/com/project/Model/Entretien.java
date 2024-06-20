package com.project.Model;

import jakarta.persistence.CascadeType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Entretien extends BaseEntity {
	@Column(nullable = false)
	private String titre ;
	@Column(nullable = false)
	private String debut ;
	@Column(nullable = false)
	private String type ;
	@Column(nullable = false)
	private String fin ;
	@Column(nullable = false)
	private String lieu ;
	
	@OneToOne(cascade = CascadeType.ALL)
	@MapsId
	@JoinColumn(name = "id")
	private Candidature candidature;

	
}
