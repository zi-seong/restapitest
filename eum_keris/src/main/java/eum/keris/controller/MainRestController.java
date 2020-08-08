package eum.keris.controller;

import java.io.ByteArrayOutputStream;
import java.util.List;

import org.apache.jena.query.Dataset;
import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.ReadWrite;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.ResultSetFormatter;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.tdb.TDBFactory;
import org.apache.jena.tdb.TDBLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import eum.keris.service.MainService;
import eum.keris.service.FusekiService;
import eum.keris.vo.LearningMapVo;

@RestController
@RequestMapping("/ido")
public class MainRestController {
	
	@Autowired
	public MainService mainService;

	
	@RequestMapping("/search/keyword/{searchKeyword}")
	public @ResponseBody List<String> keywords(@PathVariable String searchKeyword){
		return mainService.getKeyword(searchKeyword);
	}
	
	@RequestMapping("/search/learningmap/{searchKeyword}")
	public @ResponseBody List<LearningMapVo> learningMap(@PathVariable String searchKeyword){
		
		return mainService.getLearningMap(searchKeyword);
	}
	


}
