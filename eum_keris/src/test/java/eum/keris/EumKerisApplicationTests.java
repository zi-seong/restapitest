package eum.keris;

import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Map;

import org.apache.jena.fuseki.main.FusekiServer;
import org.apache.jena.query.Dataset;
import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.ReadWrite;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.ResultSetFormatter;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.riot.RDFDataMgr;
import org.apache.jena.riot.RDFFormat;
import org.apache.jena.sparql.resultset.RDFOutput;
import org.apache.jena.tdb.TDBFactory;
import org.apache.jena.tdb.TDBLoader;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import eum.keris.dao.MainMapper;
import eum.keris.service.MainService;
import eum.keris.vo.LearningMapVo;

//@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class EumKerisApplicationTests {

	@Autowired
	private MainService mainService;
	
	@Autowired
	private MainMapper mainMapper;
	
	
	
	@Test
	public void TdbTest() {
//		String directory = "src/main/resources/databases/TDB";
//		Dataset dataset = TDBFactory.createDataset(directory);
//		String file = "src/main/resources/databases/stack.rdf";
//		Model model = dataset.getDefaultModel();
//		TDBLoader.loadModel(model, file);
		//dataset.close();
		
		
		//일반형식반환
//		dataset.begin(ReadWrite.READ) ; 
//		String sparqlQueryString = "SELECT * WHERE { ?s ?p ?o . } limit 10"; 
//		Query query = QueryFactory.create(sparqlQueryString) ; 
//		QueryExecution qexec = QueryExecutionFactory.create(query, dataset) ; 
//		ResultSet results = qexec.execSelect() ; 
//		ResultSetFormatter.out(results) ; qexec.close() ; 
//		dataset.end(); 
//		dataset.close();

		
		//json형식반환
//		System.out.println("@@@@@@");
//		dataset.begin(ReadWrite.READ) ; 
//		String sparqlQueryString = "SELECT ?x ?title WHERE { ?x <http://purl.org/dc/terms/title> ?title. } limit 500"; 
//		Query query = QueryFactory.create(sparqlQueryString) ; 
//		QueryExecution qexec = QueryExecutionFactory.create(query, dataset) ; 
//		ResultSet results = qexec.execSelect() ; 
//		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//		ResultSetFormatter.outputAsJSON(outputStream, results);
//		String json = new String(outputStream.toByteArray());
//		qexec.close() ; 
//		dataset.end(); 
//		dataset.close();
//		System.out.println("a");
//		System.out.println(json);
//		

		
		//JSON-LD형식반환
//		dataset.begin(ReadWrite.READ) ; 
//		String sparqlQueryString = "SELECT * WHERE { ?s ?p ?o . } limit 10"; 
//		Query query = QueryFactory.create(sparqlQueryString) ; 
//		QueryExecution qexec = QueryExecutionFactory.create(query, dataset) ; 
//		ResultSet results = qexec.execSelect() ; 
//		Model model2 = RDFOutput.encodeAsModel(results);
//		RDFDataMgr.write(System.out, model, RDFFormat.JSONLD_COMPACT_PRETTY);
//		qexec.close() ; 
//		dataset.end(); 
//		dataset.close();
		String directory = "src/main/resources/databases/TDB";
		Dataset dataset = TDBFactory.createDataset(directory);
		FusekiServer server = FusekiServer.create().add("/dataset", dataset).build();

		
	}

}
