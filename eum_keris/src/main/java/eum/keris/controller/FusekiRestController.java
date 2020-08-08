package eum.keris.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import eum.keris.service.FusekiService;

@RestController
@RequestMapping("/fuseki")
public class FusekiRestController {
	
	@Autowired
	public FusekiService fusekiService;
	
	
	
	
	@RequestMapping("/all")
	public @ResponseBody String getFusekiDatas() {
		return fusekiService.getFusekiDatas();
	}
	
	
	@RequestMapping("/{searchKeyword}")
	public @ResponseBody String getFusekiData(@PathVariable String searchKeyword) {
		return fusekiService.getFusekiData(searchKeyword);
	}

}
