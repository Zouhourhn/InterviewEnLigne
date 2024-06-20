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
public class Recruteur extends Utilisateur {
    @Column(nullable = false)
    private String entreprise;
    
    @Column(nullable = false)
    private String grade;
}
