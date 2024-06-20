package com.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.Model.Categorie;
@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long>{

}
