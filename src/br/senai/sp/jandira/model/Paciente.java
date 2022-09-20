package br.senai.sp.jandira.model;

public class Paciente {

	private String nome;
	private String email;
	private String rg;
	private String cpf;
	private String telefone;
	private Genero genero;
	private String tipoSanguineo;
	private PlanoDeSaude planoDeSaude;
	private Endereco endereco;

//Métodos de acesso

	// nome
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	// email
	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	// plano de saúde
	public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
		this.planoDeSaude = planoDeSaude;
	}

	public PlanoDeSaude getPlanoDeSaude() {
		return planoDeSaude;
	}

	// RG
	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getRg() {
		return rg;
	}

	// CPF
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	// telefone
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTelefone() {
		return telefone;
	}

	// Sexo
	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Genero getGenero() {
		return genero;
	}

	// Tipo sanguineo
	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public String getTipoSanguineo() {
		return tipoSanguineo;
	}

	// Endereço
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Endereco getEndereco() {
		return endereco;
	}

}
