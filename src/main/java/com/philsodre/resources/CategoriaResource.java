package com.philsodre.resources;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.philsodre.domain.Categoria;



@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@Autowired
	//private CategoriaService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> find() {
		//Categoria obj = service.find(id);
		Categoria obj = new Categoria(1, "Tires");
		List<Categoria> list = new ArrayList<>();
		list.add(obj);
		return list;
	}
	
}
