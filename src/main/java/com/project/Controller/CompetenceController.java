package com.project.Controller;

import java.awt.print.Pageable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Dto.CompetenceDTO;

import com.project.Service.CompetenceService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("competence")
@RequiredArgsConstructor
public class CompetenceController {
	 @Autowired
    private final CompetenceService competenceService;


	@GetMapping
    public Page<CompetenceDTO> getCompetence(Pageable pageable)
    {
    	return competenceService.getAllCompetence(pageable);
    }


    @PostMapping
    public CompetenceDTO addOneCompetence(@RequestBody CompetenceDTO competence)
    {
	return competenceService.addOneCompetence(competence);	
    }

   

    @DeleteMapping("/{id}")
    public void deleteOneCompetence(@PathVariable long id)
    {
    	competenceService.deleteOneCompetence(id);	
    }
}
