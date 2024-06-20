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

import com.project.Dto.OffreDTO;
import com.project.Service.OffreService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("offre")
@RequiredArgsConstructor
public class OffreController {
	 @Autowired
    private final OffreService offreService;


	 @GetMapping
	    public Page<OffreDTO> getOffre(Pageable pageable)
	    {
	    	return offreService.getAllOffre(pageable);
	    	
	    }


	    @PostMapping
	    public OffreDTO addOneOffre(@RequestBody OffreDTO offre)
	    {
	    	return offreService.addOneOffre(offre);
	    }

	   

	    @DeleteMapping("/{id}")
	    public void deleteOneOffre(@PathVariable long id)
	    {
	    	offreService.deleteOneOffre(id);	
	    }
}
