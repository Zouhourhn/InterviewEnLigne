package com.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.Model.Reclamation;
@Repository
public interface ReclamationRepository extends JpaRepository<Reclamation, Long> {

}
