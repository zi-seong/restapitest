package eum.keris;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import org.apache.jena.fuseki.main.FusekiServer;
import org.apache.jena.query.Dataset;
import org.apache.jena.query.DatasetFactory;
import org.apache.jena.tdb.TDBFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import sun.misc.Launcher;

@Component
public class FusekiConfig implements CommandLineRunner , ApplicationListener<ContextClosedEvent> {
	FusekiServer fusekiserver ;

	@Override
	public void run(String... args) throws Exception {
		Resource resource = new ClassPathResource("/databases/TDB");
		try {
			Dataset dataset = TDBFactory.createDataset("/file:/home1/ncloud/databases/TDB");
			FusekiServer server = FusekiServer.create().add("/dataset", dataset).build();
			fusekiserver = server;
			System.out.println("성공!!!!!!!!!!!!!!!!!!!!!!");
			//server.start();
			System.out.println("fuseki start");
			server.start();
		}catch(Exception e) {
			System.out.println("이것도 에러야~~");
			System.out.println(resource.getURI().getPath());
			Dataset dataset = TDBFactory.createDataset(resource.getURI().getPath());
			FusekiServer server = FusekiServer.create().add("/dataset", dataset).build();
			fusekiserver = server;
			//server.start();
			System.out.println("fuseki start");
			
			server.start();
		}
		
	}

	@Override
	public void onApplicationEvent(ContextClosedEvent event) {
		System.out.println("fuseki stop");
		fusekiserver.stop();
	}
}

