package com.project.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.project.Dto.CurriculumDTO;
import com.project.Mapper.CurriculumMapper;
import com.project.Model.Curriculum;
import com.project.Repository.CurriculumRepository;

@Service
public class CurriculumServiceImplement implements CurriculumService {
	private CurriculumRepository curriculumRepository;
	@Override
	public CurriculumDTO addOneCurriculum(CurriculumDTO curriculum) {
		return CurriculumMapper.convertToDto(curriculumRepository.save(CurriculumMapper.convertToEntity(curriculum)));

	}

	@Override
	public CurriculumDTO getOneCurriculum(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteOneCurriculum(long id) {
		curriculumRepository.deleteById(id);	
		
	}

	@Override
	public Page<CurriculumDTO> getAllCurriculum(Pageable pageable) {
		Page<Curriculum> curriculums=curriculumRepository.findAll(pageable);
		return curriculums.map(CurriculumMapper::convertToDto);

	}

	@Override
	public Page<CurriculumDTO> getAllCurriculum(java.awt.print.Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

