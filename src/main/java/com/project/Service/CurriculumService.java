package com.project.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.project.Dto.CurriculumDTO;

public interface CurriculumService {

	public Page<CurriculumDTO> getAllCurriculum (Pageable pageable);
	public CurriculumDTO addOneCurriculum(CurriculumDTO curriculum);
	public CurriculumDTO getOneCurriculum(long id);
	public void deleteOneCurriculum(long id);
	Page<CurriculumDTO> getAllCurriculum(java.awt.print.Pageable pageable);
}
