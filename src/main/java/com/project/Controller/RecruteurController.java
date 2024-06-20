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

import com.project.Dto.RecruteurDTO;
import com.project.Service.RecruteurService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("recruteur")
@RequiredArgsConstructor
public class RecruteurController {
	 @Autowired
	    private final RecruteurService recruteurService;
	
	
	  @GetMapping
	    public Page<RecruteurDTO> getRecruteur(Pageable pageable)
	    {
		  return recruteurService.getAllRecruteur(pageable);
	    	
	    }


	    @PostMapping
	    public RecruteurDTO addOneRecruteur(@RequestBody RecruteurDTO recruteur)
	    {
		return recruteurService.addOneRecruteur(recruteur);	
	    }

	   

	    @DeleteMapping("/{id}")
	    public void deleteOneRecruteur(@PathVariable long id)
	    {
	    	recruteurService.deleteOneRecruteur(id);	
	    }
}
