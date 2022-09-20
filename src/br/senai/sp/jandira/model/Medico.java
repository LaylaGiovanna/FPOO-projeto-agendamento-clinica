package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Medico {

	private String nome;
	private LocalDate dataDeNascimento;
	private String sexo;
	private String crm;
	private Especialidade[] especialidades;

	
	//Nome
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Data de nascimento
	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	//sexo
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	//CRM
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	
	//Especialidade
	public Especialidade[] getEspecialidades() {
		return especialidades;
	}
	public void setEspecialidades(Especialidade[] especialidades) {
		this.especialidades = especialidades;
	}

}
