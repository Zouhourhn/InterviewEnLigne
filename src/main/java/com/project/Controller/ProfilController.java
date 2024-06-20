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

import com.project.Dto.ProfilDTO;

import com.project.Service.ProfilService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("profil")
@RequiredArgsConstructor
public class ProfilController {
	 @Autowired
	    private final ProfilService profilService;
	
	 @GetMapping
	    public Page<ProfilDTO> getProfil(Pageable pageable)
	    {
	    	return profilService.getAllProfil(pageable);
	    	
	    }


	    @PostMapping
	    public ProfilDTO addOneProfil(@RequestBody ProfilDTO profil)
	    {
		return profilService.addOneProfil(profil);	
	    }

	   

	    @DeleteMapping("/{id}")
	    public void deleteOneProfil(@PathVariable long id)
	    {
	    	profilService.deleteOneProfil(id);	
	    }
}
