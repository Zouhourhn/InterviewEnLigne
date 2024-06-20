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

import com.project.Dto.CurriculumDTO;
import com.project.Service.CurriculumService;


import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("curriculum")
@RequiredArgsConstructor
public class CurriculumController {
	 @Autowired
    private final CurriculumService curriculumService;


	@GetMapping
    public Page<CurriculumDTO> getCurriculums(Pageable pageable)
    {
    	return curriculumService.getAllCurriculum(pageable);
    }


    @PostMapping
    public CurriculumDTO addOneCurriculum(@RequestBody CurriculumDTO curriculum)
    {
	return curriculumService.addOneCurriculum(curriculum);	
    }

   

    @DeleteMapping("/{id}")
    public void deleteOneCurriculum(@PathVariable long id)
    {
    	curriculumService.deleteOneCurriculum(id);	
    }
}
