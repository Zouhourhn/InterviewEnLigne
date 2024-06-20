package com.project.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Dto.CandidatureDTO;
import com.project.Dto.CompetenceDTO;
import com.project.Dto.CurriculumDTO;
import com.project.Dto.UtilisateurDTO;
import com.project.Service.UtilisateurService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/utilisateurs")
@RequiredArgsConstructor
public class UtilisateurController {

	    @Autowired
	    private  UtilisateurService utilisateurService;
	
	
	    @GetMapping
	    public ResponseEntity<Page<UtilisateurDTO>> getAllUtilisateurs(Pageable pageable) {
	        Page<UtilisateurDTO> utilisateurs = utilisateurService.getAllUtilisateurs(pageable);
	        return ResponseEntity.ok(utilisateurs);
	    }
	    @PostMapping
	    public UtilisateurDTO addOneUtilisateur(@RequestBody UtilisateurDTO utilisateur)
	    {
		return utilisateurService.addOneUtilisateur(utilisateur);	
	    }

	   

	    @DeleteMapping("/{id}")
	    public void deleteOneUtilisateur(@PathVariable long id)
	    {
	    	utilisateurService.deleteOneUtilisateur(id);	
	    }
	    
	    @PostMapping("/candidature/{id}")
	    public UtilisateurDTO assignToCandidature(@PathVariable long id,@RequestBody CandidatureDTO candidature)
	    {
	    return utilisateurService.assignCandidatureToUtilisateur(id, candidature);	
	    }
	    
	    @PostMapping("/reclamation/{id}")
	    public UtilisateurDTO assignToCurriculum(@PathVariable long id,@RequestBody CurriculumDTO curriculum)
	    {
		return utilisateurService.assignCurriculumToUtilisateur(id, curriculum);	
	    }
	    
	    @PostMapping("/paiement/{id}")
	    public UtilisateurDTO assignToCompetence(@PathVariable long id,@RequestBody CompetenceDTO competence)
	    {
	    return utilisateurService.assignCompetenceToUtilisateur(id, competence);	
	    }
}
	   