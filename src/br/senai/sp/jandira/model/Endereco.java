package br.senai.sp.jandira.model;

public class Endereco {

	private String cep;
	private String numero;
	private String bairro;
	private String cidade;
	private Estados estado;
	private String tipo;
	private String logradouro;
	private String pontoDeReferencia;
	private String complemento;
	
	//CEP
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCep() {
		return cep;
	}
	
	//Número
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getNumero() {
		return numero;
	}
	
	//Bairro
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getBairro() {
		return bairro;
	}
	
	//Cidade
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCidade() {
		return cidade;
	}
	
	
	//Estado
	public void setEstado(Estados estado) {
		this.estado = estado;
	}
	public Estados getEstado() {
		return estado;
	}
	
	
	//Tipo
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTipo() {
		return tipo;
	}
	
	
	//Logradouro
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getLogradouro() {
		return logradouro;
	}
	
	
	//Ponto de referência
	public void setPontoDeReferencia(String pontoDeReferencia) {
		this.pontoDeReferencia = pontoDeReferencia;
	}
	public String getPontoDeReferencia() {
		return pontoDeReferencia;
	}
	
	
	//Complemento
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getComplemento() {
		return complemento;
	}
	
	
	

}
