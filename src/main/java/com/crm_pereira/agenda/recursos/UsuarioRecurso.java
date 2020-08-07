package com.crm_pereira.agenda.recursos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm_pereira.agenda.entidades.Usuario;


@RestController
@RequestMapping(value="/usuarios")
public class UsuarioRecurso {
	
	@GetMapping
	public ResponseEntity<List<Usuario>> findAll() {
		List<Usuario> list = new ArrayList<>();
		list.add(new Usuario(1, "cesar.pereiram@gmail.com", "cesar", "as222", new Date(), "39393222"));
		list.add(new Usuario(2, "aaaa.pereiram@gmail.com", "cesar", "as222", new Date(), "39393222"));
		return ResponseEntity.ok().body(list);
	}

/*	
	@GetMapping(value="/{id}")
	public ResponseEntity<> findById(@PathVariable String id) {
		
		return ResponseEntity.ok().body(new UserDTO(obj));
	}
*/
	
	
	
	
	
	
	
}

