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

import com.project.Dto.CandidatureDTO;

import com.project.Service.CandidatureService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("candidature")
@RequiredArgsConstructor
public class CandidatureController {
	 @Autowired
    private final  CandidatureService candidatureService;

	@GetMapping
    public Page<CandidatureDTO> getCandidature(Pageable pageable)
    {
		return candidatureService.getAllCandidature(pageable);
    }


    @PostMapping
    public CandidatureDTO addOneCandidature(@RequestBody CandidatureDTO candidature)
    {
	return candidatureService.addOneCandidature(candidature);	
    }

   

    @DeleteMapping("/{id}")
    public void deleteOneCandidature(@PathVariable long id)
    {
    	candidatureService.deleteOneCandidature(id);	
    }
}
