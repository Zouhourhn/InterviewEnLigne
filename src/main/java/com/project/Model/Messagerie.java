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
public class Messagerie extends BaseEntity{
	@Column(nullable = false)
	private String text ;

	@ManyToOne(optional = false,fetch = FetchType.EAGER)
	private Utilisateur emetteur;
	@ManyToOne(optional = false,fetch = FetchType.EAGER)
	private Utilisateur recepteur;

	
}
