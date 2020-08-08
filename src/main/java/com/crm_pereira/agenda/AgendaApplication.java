package com.crm_pereira.agenda;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.crm_pereira.agenda.entidades.Usuario;
import com.crm_pereira.agenda.repositorio.UsuarioRepositorio;

@SpringBootApplication
public class AgendaApplication implements CommandLineRunner {

	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	
	
	public static void main(String[] args) {
		SpringApplication.run(AgendaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Usuario usu1 = new Usuario(1, "testse@gmail.com", "teste", "777777",new Date(), "4799889999");
		Usuario usu2 = new Usuario(2, "sssstestse@gmail.com", "XXXteste", "78888",new Date(), "4798989999");
		usuarioRepositorio.save(usu1);
		usuarioRepositorio.save(usu2);
	}

}
