package com.crm_pereira.agenda.recursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm_pereira.agenda.entidades.Agendamentos;
import com.crm_pereira.agenda.repositorio.AgendamentoRepositorio;


@RestController
@RequestMapping(value="/agendas")
public class AgendamentoRecurso {
	
	
	@Autowired
	private AgendamentoRepositorio usuarioRepositorio;
	
	
	@GetMapping
	public ResponseEntity<List<Agendamentos>> findAll() {
		List<Agendamentos> list = usuarioRepositorio.findAll();
		return ResponseEntity.ok().body(list);
	}

	
	@GetMapping(value="/{id}")
	public ResponseEntity<Agendamentos> findById(@PathVariable Integer id) {
		Agendamentos usu = usuarioRepositorio.findById(id).get();
		return ResponseEntity.ok().body(usu);
	}	
	
	
	
}

