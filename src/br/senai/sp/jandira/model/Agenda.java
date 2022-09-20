package br.senai.sp.jandira.model;

import java.time.LocalDate;

import java.time.LocalTime;

public class Agenda {

	private Paciente paciente;
	private Medico medico;
	private Especialidade especialidade;
	private LocalDate dataDaConsulta;
	private LocalTime horaDaConsulta;
	private String observacao;
	private boolean comparecimento;

	
	//Paciente
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	//Meico
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	//Especialidade
	public Especialidade getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}
	
	//Data da consulta
	public LocalDate getDataDaConsulta() {
		return dataDaConsulta;
	}
	public void setDataDaConsulta(LocalDate dataDaConsulta) {
		this.dataDaConsulta = dataDaConsulta;
	}

	//Hora da consulta
	public LocalTime getHoraDaConsulta() {
		return horaDaConsulta;
	}
	public void setHoraDaConsulta(LocalTime horaDaConsulta) {
		this.horaDaConsulta = horaDaConsulta;
	}
	
	//Observação
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	//Comparecimento
	public boolean isComparecimento() {
		return comparecimento;
	}
	public void setComparecimento(boolean comparecimento) {
		this.comparecimento = comparecimento;
	}

}
