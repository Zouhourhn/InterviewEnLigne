package com.project.Model;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Reclamation extends Messagerie {
	@Column(nullable = false)
	private String objet ;


}
