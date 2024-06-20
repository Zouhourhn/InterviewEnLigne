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

import com.project.Dto.ReclamationDTO;
import com.project.Service.ReclamationService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("reclamation")
@RequiredArgsConstructor
public class ReclamationController {
	 @Autowired
	    private final ReclamationService reclamationService;
	

	  @GetMapping
	    public Page<ReclamationDTO> getReclamation(Pageable pageable)
	    {
	    	return reclamationService.getAllReclamation(pageable);
	    	
	    }


	    @PostMapping
	    public ReclamationDTO addOneReclamation(@RequestBody ReclamationDTO reclamation)
	    {
		return reclamationService.addOneReclamation(reclamation);	
	    }

	   

	    @DeleteMapping("/{id}")
	    public void deleteOneReclamation(@PathVariable long id)
	    {
	    	reclamationService.deleteOneReclamation(id);	
	    }
}
