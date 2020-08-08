package com.crm_pereira.agenda.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crm_pereira.agenda.entidades.Agendamentos;

@Repository
public interface AgendamentoRepositorio extends JpaRepository<Agendamentos, Integer> {
	
	
}
