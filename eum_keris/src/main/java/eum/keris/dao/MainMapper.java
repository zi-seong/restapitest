package eum.keris.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import eum.keris.vo.LearningMapVo;

@Mapper
public interface MainMapper {
	
	
	
	public List<String> searchKeyword(String searchKeyword);
	public List<LearningMapVo> searchLearningMap(String searchKeyword);
	
}
