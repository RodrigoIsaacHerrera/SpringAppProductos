package com.tata.productos.app.SpringAppProductos;

import com.tata.productos.app.SpringAppProductos.core.model.ProductoDTO;
import com.tata.productos.app.SpringAppProductos.core.model.ProductoRepositoryDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringAppProductosApplication implements CommandLineRunner {
	private static final Logger log = LoggerFactory.getLogger(SpringAppProductosApplication.class);
	@Autowired
	private ProductoRepositoryDAO repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringAppProductosApplication.class, args);
	}


	public void run(String... args) {

		log.info("StartApplication...");
		// TEST for out info on console

		//Objects Using Constructors
		repository.save(new ProductoDTO(1,"Xiaomi 344", "Smart Phone"));
		repository.save(new ProductoDTO(2,"Manual de lambdas Java 8, los desafios me encantan", "Book"));
		repository.save(new ProductoDTO(3,"El principio de mejor entregar algo que nada", "Manual"));

		System.out.println("\nfindAll()");
		repository.findAll().forEach(x -> System.out.println("el elemento fue encontrado \n" + x));

		System.out.println("\nfindById(1)");
		repository.findById(1).ifPresent(x -> System.out.println("el elemento fue encontrado \n" + x));
		System.out.println("\nfindByType('Smart Phone')");
		repository.findByType("Smart Phone").forEach( x -> System.out.println("el elemento fue encontrado \n" + x));
		System.out.println("\nfindByName('El principio de mejor entregar algo que nada')");
		repository.findByName("El principio de mejor entregar algo que nada").forEach(x -> System.out.println("el elemento fue encontrado \n" + x));
		System.out.println("\nfindById(3)");
		repository.findById(3).ifPresent(x -> System.out.println(x));

		System.out.println("\nfindByName('Xiaomi 344')");
		repository.findByName("Xiaomi 344").forEach( x -> System.out.println("el elemento fue encontrado \n" + x));


	}


}
