package com.crm_pereira.agenda;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.crm_pereira.agenda.entidades.Agendamentos;
import com.crm_pereira.agenda.entidades.Usuario;
import com.crm_pereira.agenda.repositorio.AgendamentoRepositorio;
import com.crm_pereira.agenda.repositorio.UsuarioRepositorio;

@SpringBootApplication
public class AgendaApplication implements CommandLineRunner {

	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	
	@Autowired
	private AgendamentoRepositorio agendamentoRepositorio;
	
	
	public static void main(String[] args) {
		SpringApplication.run(AgendaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Usuario usu1 = new Usuario(1, "cesar.pereiram@gmail.com", "Cesar Pereira", "777777",new Date(), "4799889999");
		Usuario usu2 = new Usuario(2, "fran@gmail.com.br", "Francine Veiga", "788888888",new Date(), "4798989999");
				
		Agendamentos  age1  = new Agendamentos(1, new Date(), "15:05", usu1);
		Agendamentos  age2  = new Agendamentos(2, new Date(), "15:25", usu2);
		
		usu1.getAgendamentos().addAll(Arrays.asList(age1,age2));
		usu2.getAgendamentos().addAll(Arrays.asList(age2));
		
		usuarioRepositorio.save(usu1);
		usuarioRepositorio.save(usu2);
				
		agendamentoRepositorio.save(age1);
		agendamentoRepositorio.save(age2);
		
	}

}
