package com.project.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.Model.Admin;
@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

}
