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

import com.project.Dto.AdminDTO;
import com.project.Service.AdminService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("admin")
@RequiredArgsConstructor
public class AdminController {
	 @Autowired
    private AdminService adminService;


	@GetMapping
    public Page<AdminDTO> getAdmin(Pageable pageable)
    {
		return adminService.getAllAdmin(pageable);
    }


    @PostMapping
    public AdminDTO addOneAdmin(@RequestBody AdminDTO admin)
    {
	return adminService.addOneAdmin(admin);	
    }

   

    @DeleteMapping("/{id}")
    public void deleteOneAdmin(@PathVariable long id)
    {
    	adminService.deleteOneAdmin(id);	
    }
}
