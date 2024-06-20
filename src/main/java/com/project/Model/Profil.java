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
public class Profil extends BaseEntity {
	@Column(nullable = true)
	private String photo ;
	@Column(nullable = false)
	private String telephone ;
	@Column(nullable = false)
	private String adresse ;
	@Column(nullable = true)
	private String presentation ;
	@OneToOne(cascade = CascadeType.ALL)
	@MapsId
	@JoinColumn(name = "id")
	private Utilisateur utilisateur;

	
}
