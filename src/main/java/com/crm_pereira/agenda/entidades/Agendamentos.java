package com.crm_pereira.agenda.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Agendamentos implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	private Date 	Dta_Agenda;
	private String 	Hr_Agenda;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;
	
	public Agendamentos() {
		
	}

	public Agendamentos(Integer id, Date dta_Agenda, String hr_Agenda, Usuario usuario) {
		super();
		Id = id;
		Dta_Agenda = dta_Agenda;
		Hr_Agenda = hr_Agenda;
		this.usuario = usuario;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Date getDta_Agenda() {
		return Dta_Agenda;
	}

	public void setDta_Agenda(Date dta_Agenda) {
		Dta_Agenda = dta_Agenda;
	}

	public String getHr_Agenda() {
		return Hr_Agenda;
	}

	public void setHr_Agenda(String hr_Agenda) {
		Hr_Agenda = hr_Agenda;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
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
		Agendamentos other = (Agendamentos) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}
	
	
}
