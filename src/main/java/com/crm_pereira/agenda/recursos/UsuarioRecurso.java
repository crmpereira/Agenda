package com.crm_pereira.agenda.recursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm_pereira.agenda.entidades.Usuario;
import com.crm_pereira.agenda.repositorio.UsuarioRepositorio;


@RestController
@RequestMapping(value="/usuarios")
public class UsuarioRecurso {
	
	
	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	
	
	@GetMapping
	public ResponseEntity<List<Usuario>> findAll() {
		List<Usuario> list = usuarioRepositorio.findAll();
		return ResponseEntity.ok().body(list);
	}

	
	@GetMapping(value="/{id}")
	public ResponseEntity<Usuario> findById(@PathVariable Integer id) {
		Usuario usu = usuarioRepositorio.findById(id);
		return ResponseEntity.ok().body(usu);
	}	
	
	
	
}

