package com.project.Model;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class Candidature extends BaseEntity {

	@Column(nullable = false)
	private String titre ;
	@Column(nullable = false)
	private String prenom ;
	@Column(columnDefinition = "varchar(30) default 'en attente'")
	private String etat ;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@MapsId
	@JoinColumn(name = "id")
	private Entretien entretien;
	
	@ManyToOne(optional = false,fetch = FetchType.EAGER)

	private Offre offre;
	
	@ManyToOne(optional = false,fetch = FetchType.EAGER)

	private Utilisateur utilisateur;
	
}
