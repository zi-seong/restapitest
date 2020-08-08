package eum.keris.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eum.keris.dao.MainMapper;
import eum.keris.service.MainService;
import eum.keris.vo.LearningMapVo;
import eum.keris.vo.LessonVo;

@Service
public class MainServiceImpl implements MainService {

	@Autowired
	private MainMapper mainMapper;
	

	
	
	public List<String> getKeyword(String searchKeyword){
		return mainMapper.searchKeyword(searchKeyword);
	}
	
	public List<LearningMapVo> getLearningMap(String searchKeyword){
		return mainMapper.searchLearningMap(searchKeyword);
	}
	
}
