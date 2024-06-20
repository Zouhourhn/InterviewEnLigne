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

import com.project.Dto.CategorieDTO;
import com.project.Service.CategorieService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("categorie")
@RequiredArgsConstructor
public class CategorieController {
	 @Autowired
    private final CategorieService categorieService;


	@GetMapping
    public Page<CategorieDTO> getCategorie(Pageable pageable)
    {
		return categorieService.getAllCategorie(pageable);
    }


    @PostMapping
    public CategorieDTO addOneCategorie(@RequestBody CategorieDTO categorie)
    {
	return categorieService.addOneCategorie(categorie);	
    }

   

    @DeleteMapping("/{id}")
    public void deleteOneCategorie(@PathVariable long id)
    {
    	categorieService.deleteOneCategorie(id);	
    }
}
