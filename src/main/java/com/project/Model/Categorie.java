package com.project.Model;



import java.util.List;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
public class Categorie extends BaseEntity {
	@Column(nullable = false)
	private String titre ;

	@OneToMany(mappedBy = "categorie")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private List<Offre> offres;
	
	
}
	
	

