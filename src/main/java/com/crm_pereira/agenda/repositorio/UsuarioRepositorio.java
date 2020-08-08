package com.crm_pereira.agenda.repositorio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.crm_pereira.agenda.entidades.Usuario;

@Component
public class UsuarioRepositorio {

	private Map<Integer, Usuario> map  = new HashMap<>();
	
	
	public void save(Usuario obj) {
		map.put(obj.getId(), obj);
	}
	
	public Usuario findById(Integer id) {
		return map.get(id);
	}
	
	public List<Usuario> findAll(){
		return new ArrayList<Usuario>(map.values());
	}
	
	
}
