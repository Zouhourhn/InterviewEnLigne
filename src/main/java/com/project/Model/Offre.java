package com.project.Model;

import java.util.List;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Offre extends BaseEntity {
	@Column(nullable = false)
	private String titre ;
	@Column(nullable = false)
	private String description ;
	@Column(nullable = false)
	private String compétences ;
	
	
	
	@OneToMany(mappedBy = "offre")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private List<Candidature> condidatures;
	
	@ManyToOne(optional = false,fetch = FetchType.EAGER)

	private Categorie categorie;
}
