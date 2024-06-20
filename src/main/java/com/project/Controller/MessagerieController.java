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
import com.project.Dto.MessagerieDTO;
import com.project.Service.MessagerieService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("messagerie")
@RequiredArgsConstructor
public class MessagerieController {
	 @Autowired
    private final MessagerieService messagerieService;


	  @GetMapping
	    public Page<MessagerieDTO> getMessagerie(Pageable pageable)
	    {
	    	return messagerieService.getAllMessagerie(pageable);
	    }

	    @PostMapping
	    public MessagerieDTO addOneMessagerie(@RequestBody MessagerieDTO messagerie)
	    {
		return messagerieService.addOneMessagerie(messagerie);	
	    }

	   

	    @DeleteMapping("/{id}")
	    public void deleteOneMessagerie(@PathVariable long id)
	    {
	    	messagerieService.deleteOneMessagerie(id);	
	    }
}
