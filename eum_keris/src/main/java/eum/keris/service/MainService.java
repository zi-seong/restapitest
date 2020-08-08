package eum.keris.service;

import java.util.List;

import eum.keris.vo.LearningMapVo;
import eum.keris.vo.LessonVo;

public interface MainService {
	
	
	public List<String> getKeyword(String searchKeyword);
	public List<LearningMapVo> getLearningMap(String searchKeyword);

}
