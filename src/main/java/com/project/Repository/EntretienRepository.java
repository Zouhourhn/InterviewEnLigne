package com.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.Model.Entretien;
@Repository
public interface EntretienRepository extends JpaRepository<Entretien, Long> {

}
