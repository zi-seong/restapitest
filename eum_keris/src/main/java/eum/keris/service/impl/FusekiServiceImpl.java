package eum.keris.service.impl;

import org.springframework.stereotype.Service;

import eum.keris.dao.FusekiMapper;
import eum.keris.service.FusekiService;

@Service
public class FusekiServiceImpl implements FusekiService {
	
	FusekiMapper tdbMapper = new FusekiMapper();

	@Override
	public String getFusekiDatas() {
		return tdbMapper.searchFusekiDatas();
	}

	@Override
	public String getFusekiData(String searchKeyword) {
		return tdbMapper.searchFusekiData(searchKeyword);
	}
	

}
