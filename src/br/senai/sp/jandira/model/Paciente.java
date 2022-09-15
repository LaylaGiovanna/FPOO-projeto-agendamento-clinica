package br.senai.sp.jandira.model;

public class Paciente {
	
		private String nome;
		private String email;
		private PlanoDeSaude planoDeSaude;
		
//		Métodos de acesso
		
		//nome
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getNome() {
			return nome;
		}
		
		
		//email
		public void setEmail(String email) {
			this.email = email;
		}
		public String getEmail() {
			return email;
		}
		
		//plano de saúde
		public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
			this.planoDeSaude = planoDeSaude;
		}
		public PlanoDeSaude getPlanoDeSaude() {
			return planoDeSaude;
		}
}
