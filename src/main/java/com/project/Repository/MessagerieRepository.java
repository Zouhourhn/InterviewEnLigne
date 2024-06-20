package com.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.Model.Messagerie;
@Repository
public interface MessagerieRepository extends JpaRepository<Messagerie, Long>{

}
