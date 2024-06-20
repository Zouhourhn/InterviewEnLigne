package com.project.Model;

import java.util.List;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
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
@Inheritance(strategy = InheritanceType.JOINED)
public class Utilisateur extends BaseEntity {
    @Column(nullable = false)
    private String nom;
    
    @Column(nullable = false)
    private String prenom;
    
    @Column(nullable = false, unique = true)
    private String email;
    
    @Column(nullable = false)
    private String mdp;

    @OneToMany(mappedBy = "utilisateur")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<Candidature> candidatures;

    @OneToMany(mappedBy = "utilisateur")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<Curriculum> curriculums;

    @OneToMany(mappedBy = "utilisateur")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<Competence> competences;
}
