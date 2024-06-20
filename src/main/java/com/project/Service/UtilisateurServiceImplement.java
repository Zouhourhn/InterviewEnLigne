package com.project.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.project.Dto.CandidatureDTO;
import com.project.Dto.CompetenceDTO;
import com.project.Dto.CurriculumDTO;
import com.project.Dto.UtilisateurDTO;
import com.project.Mapper.CandidatureMapper;
import com.project.Mapper.CompetenceMapper;
import com.project.Mapper.CurriculumMapper;
import com.project.Mapper.UtilisateurMapper;
import com.project.Model.Candidature;
import com.project.Model.Competence;
import com.project.Model.Curriculum;
import com.project.Model.Utilisateur;
import com.project.Repository.CandidatureRepository;
import com.project.Repository.CompetenceRepository;
import com.project.Repository.CurriculumRepository;
import com.project.Repository.UtilisateurRepository;


@Service
public class UtilisateurServiceImplement implements UtilisateurService {
    @Autowired

	private  UtilisateurRepository utilisateurRepository;
    @Autowired

	private  CandidatureRepository  candidatureRepository;
    @Autowired

	private  CurriculumRepository  curriculumRepository;
    @Autowired

	private  CompetenceRepository  competenceRepository;
	@Override
	public UtilisateurDTO addOneUtilisateur(UtilisateurDTO utilisateur) {
		return UtilisateurMapper.convertToDto(utilisateurRepository.save(UtilisateurMapper.convertToEntity(utilisateur)));
	}

	@Override
	public void deleteOneUtilisateur(long id) {
		utilisateurRepository.deleteById(id);
		
	}

	@Override
	public Optional<UtilisateurDTO> findOneUtilisateur(long id) {
		// TODO Auto-generated method stub
		return utilisateurRepository.findById(id).map(UtilisateurMapper::convertToDto);
	}

	@Override
	public UtilisateurDTO assignCandidatureToUtilisateur(long id, CandidatureDTO candidature) {
		Utilisateur utilisateur=utilisateurRepository.findById(id).orElse(null);
		if(utilisateur!=null)
		{
			Candidature cand=CandidatureMapper.convertToEntity(candidature);
			cand.setUtilisateur(utilisateur);
			candidatureRepository.save(cand);
			return UtilisateurMapper.convertToDto(utilisateur);
		}
		
		return null;
	}

	@Override
	public UtilisateurDTO assignCurriculumToUtilisateur(long id, CurriculumDTO curriculum) {
		Utilisateur utilisateur=utilisateurRepository.findById(id).orElse(null);
		if(utilisateur!=null)
		{
			Curriculum cur=CurriculumMapper.convertToEntity(curriculum);
			cur.setUtilisateur(utilisateur);
			curriculumRepository.save(cur);
			return UtilisateurMapper.convertToDto(utilisateur);
		}
		return null;
	}

	@Override
	public UtilisateurDTO assignCompetenceToUtilisateur(long id, CompetenceDTO competence) {
		Utilisateur utilisateur=utilisateurRepository.findById(id).orElse(null);
		if(utilisateur!=null)
		{
			Competence comp=CompetenceMapper.convertToEntity(competence);
			comp.setUtilisateur(utilisateur);
			competenceRepository.save(comp);
			return UtilisateurMapper.convertToDto(utilisateur);
		}
		return null;
	}

	@Override
	public Page<UtilisateurDTO> getAllUtilisateurs(Pageable pageable) {
			Page<Utilisateur> utilisateurs=utilisateurRepository.findAll(pageable);
			return utilisateurs.map(UtilisateurMapper::convertToDto);
	}

}
