package com.project.Service;

import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.project.Dto.CategorieDTO;
import com.project.Mapper.CategorieMapper;
import com.project.Model.Categorie;
import com.project.Repository.CategorieRepository;

@Service
public class CategorieServiceImplement implements CategorieService{
	private CategorieRepository categorieRepository;


	@Override
	public CategorieDTO addOneCategorie(CategorieDTO categorie) {
		return CategorieMapper.convertToDto(categorieRepository.save(CategorieMapper.convertToEntity(categorie)));

	}

	@Override
	public void deleteOneCategorie(long id) {
		categorieRepository.deleteById(id);
	}

	@Override
	public Page<CategorieDTO> getAllCategorie(Pageable pageable) {
		Page<Categorie> categories=categorieRepository.findAll(pageable);
		return categories.map(CategorieMapper::convertToDto);

	}

	@Override
	public Page<CategorieDTO> getAllCategorie(java.awt.print.Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
