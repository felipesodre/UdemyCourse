package com.philsodre;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.philsodre.domain.Categoria;
import com.philsodre.domain.Produto;
import com.philsodre.repositories.CategoriaRepository;
import com.philsodre.repositories.ProdutoRepository;

@SpringBootApplication
public class UdemyCourseApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository catRepo; 
	@Autowired
	private ProdutoRepository prodRepo; 
	public static void main(String[] args) {
		SpringApplication.run(UdemyCourseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria c1 = new Categoria(null, "Tires");
		Categoria c2 = new Categoria(null, "BreakPaddle");
		
		Produto p1 = new Produto(null, "All Season", 200.00); 
		Produto p2 = new Produto(null, "Winter", 400.00);
		
		c1.getProdutos().addAll(Arrays.asList(p1,p2));
		
		p1.getCategorias().addAll(Arrays.asList(c1,c2));
		catRepo.saveAll(Arrays.asList(c1,c2));
		prodRepo.saveAll(Arrays.asList(p1,p2));
		
		
	}

}

