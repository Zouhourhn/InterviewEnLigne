package com.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.Model.Offre;
@Repository
public interface OffreRepository extends JpaRepository<Offre, Long> {

}
