package com.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.Model.Profil;
@Repository
public interface ProfilRepository extends JpaRepository<Profil, Long> {

}
