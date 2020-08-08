package com.crm_pereira.agenda.repositorio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;
import com.crm_pereira.agenda.entidades.Agendamentos;

@Component
public class AgendamentoRepositorio {

	private Map<Integer, Agendamentos> map  = new HashMap<>();
	
	
	public void save(Agendamentos obj) {
		map.put(obj.getId(), obj);
	}
	
	public Agendamentos findById(Integer id) {
		return map.get(id);
	}
	
	public List<Agendamentos> findAll(){
		return new ArrayList<Agendamentos>(map.values());
	}
	
	
}
