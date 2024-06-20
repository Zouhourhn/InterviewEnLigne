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

import com.project.Dto.EntretienDTO;
import com.project.Service.EntretienService;

import lombok.RequiredArgsConstructor;
@RestController
@RequestMapping("entretien")
@RequiredArgsConstructor
public class EntretienController {
	 @Autowired
    private final EntretienService entretienService;


	 @GetMapping
	    public Page<EntretienDTO> getEntretien(Pageable pageable)
	    {
		 return entretienService.getAllEntretien(pageable);
	    	
	    }


	    @PostMapping
	    public EntretienDTO addOneEntretien(@RequestBody EntretienDTO entretien)
	    {
		return entretienService.addOneEntretien(entretien);	
	    }

	   

	    @DeleteMapping("/{id}")
	    public void deleteOneEntretien(@PathVariable long id)
	    {
	    	entretienService.deleteOneEntretien(id);	
	    }
}
