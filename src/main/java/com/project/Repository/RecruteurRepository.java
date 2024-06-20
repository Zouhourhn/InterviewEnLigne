package com.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.Model.Recruteur;
@Repository
public interface RecruteurRepository extends JpaRepository<Recruteur, Long> {

}
