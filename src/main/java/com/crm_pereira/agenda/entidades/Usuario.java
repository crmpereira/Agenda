package com.crm_pereira.agenda.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Usuario   implements Serializable  {

	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	private String Email;
	private String Nome;
	private String Passoword;
	private Date Dta_Cadastro;
	private String Telefone;
	
	@JsonIgnore
	@OneToMany(mappedBy = "usuario")
	private List<Agendamentos> agendamentos = new ArrayList<>();
	
	
	public Usuario() {
		
	}	
	
	public Usuario(Integer id, String email, String nome, String passoword, Date dta_Cadastro, String telefone) {
		super();
		Id = id;
		Email = email;
		Nome = nome;
		Passoword = passoword;
		Dta_Cadastro = dta_Cadastro;
		Telefone = telefone;
	}


	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getPassoword() {
		return Passoword;
	}

	public void setPassoword(String passoword) {
		Passoword = passoword;
	}

	public Date getDta_Cadastro() {
		return Dta_Cadastro;
	}

	public void setDta_Cadastro(Date dta_Cadastro) {
		Dta_Cadastro = dta_Cadastro;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

		
	public List<Agendamentos> getAgendamentos() {
		return agendamentos;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}

	
	
	
	
	
	
}
