package eum.keris.dao;

import java.io.ByteArrayOutputStream;

import org.apache.jena.query.Dataset;
import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.ReadWrite;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.ResultSetFormatter;
import org.apache.jena.tdb.TDBFactory;

public class FusekiMapper {
	
	public String searchFusekiDatas() {

		
//TDB사용 코드
//		String directory = "src/main/resources/databases/TDB";
//		Dataset dataset = TDBFactory.createDataset(directory);
//		String json;
//		dataset.begin(ReadWrite.READ) ; 
//		try{
//			String sparqlQueryString = "SELECT * WHERE { ?s ?p ?o . }"; 
//			Query query = QueryFactory.create(sparqlQueryString) ; 
//			QueryExecution qexec = QueryExecutionFactory.create(query, dataset) ; 
//			ResultSet results = qexec.execSelect() ; 
//			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//			ResultSetFormatter.outputAsJSON(outputStream, results);
//			json = new String(outputStream.toByteArray());
//			qexec.close() ; 
//		}finally {
//			dataset.end(); 
//			dataset.close();
//		}
//		return json;
		
		
		String json;
		QueryExecution qexec = QueryExecutionFactory.sparqlService("http://localhost:3330/dataset", "SELECT * WHERE { ?s ?p ?o . }") ;
		ResultSet results = qexec.execSelect() ; 
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		ResultSetFormatter.outputAsJSON(outputStream, results);
		json = new String(outputStream.toByteArray());
		return json;
	}
	
	
	public String searchFusekiData(String searchKeyword) {
//TDB 사용 코드
//		String directory = "src/main/resources/databases/TDB";
//		Dataset dataset = TDBFactory.createDataset(directory);
//		String json;
//		dataset.begin(ReadWrite.READ) ; 
//		try{
//			String sparqlQueryString = "SELECT ?x ?"+searchKeyword+" WHERE { ?x <http://purl.org/dc/terms/"+searchKeyword+"> ?"+searchKeyword+". } limit 500"; 
//			Query query = QueryFactory.create(sparqlQueryString) ; 
//			QueryExecution qexec = QueryExecutionFactory.create(query, dataset) ; 
//			ResultSet results = qexec.execSelect() ; 
//			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//			ResultSetFormatter.outputAsJSON(outputStream, results);
//			json = new String(outputStream.toByteArray());
//			qexec.close() ; 
//		}finally {
//			dataset.end(); 
//			dataset.close();
//		}
//		return json;
//		
		
		
		String json;
		QueryExecution qexec = QueryExecutionFactory.sparqlService("http://localhost:3330/dataset", "SELECT ?x ?"+searchKeyword+" WHERE { ?x <http://purl.org/dc/terms/"+searchKeyword+"> ?"+searchKeyword+". } limit 500") ;
		ResultSet results = qexec.execSelect() ; 
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		ResultSetFormatter.outputAsJSON(outputStream, results);
		json = new String(outputStream.toByteArray());
		return json;
		
	}
	

}
