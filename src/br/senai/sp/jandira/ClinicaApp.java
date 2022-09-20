package br.senai.sp.jandira;

import java.time.LocalDate;
import java.time.LocalTime;

import br.senai.sp.jandira.model.Agenda;
import br.senai.sp.jandira.model.Endereco;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Estados;
import br.senai.sp.jandira.model.Genero;
import br.senai.sp.jandira.model.Generos;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class ClinicaApp {

	public static void main(String[] args) {

		// Especialidades
		Especialidade especialidade1 = new Especialidade();
		especialidade1.setNome("Cardiologia");

		Especialidade especialidade2 = new Especialidade();
		especialidade2.setNome("Otorrinolaringologia");

		Especialidade especialidade3 = new Especialidade();
		especialidade3.setNome("Fisioterapia");
		especialidade3.setDescricao(
				"Ela estuda, diagnostica, previne e trata os distúrbios, entre outros, cinético-funcionais decorrentes de alterações de órgãos e sistemas humanos.");

		Especialidade especialidade4 = new Especialidade();
		especialidade4.setNome("Gastroenterologia");

		Especialidade especialidade5 = new Especialidade();
		especialidade5.setNome("Clínica Geral");

		// Planos
		PlanoDeSaude plano1 = new PlanoDeSaude();
		plano1.setOperadora("Unimed");
		plano1.setTipoDoPlano("Bronze");

		PlanoDeSaude plano2 = new PlanoDeSaude();
		plano2.setOperadora("Bradesco");
		plano2.setTipoDoPlano("Ouro");

		// Endereços
		Endereco endereco1 = new Endereco();
		endereco1.setLogradouro("Rua Elton Silva");
		endereco1.setNumero("905");
		endereco1.setBairro("Centro");
		endereco1.setCidade("Jandira");
		endereco1.setCep("06600-025");
		endereco1.setEstado(Estados.SAO_PAULO);
		endereco1.setComplemento("Escola");
		endereco1.setPontoDeReferencia("Em frente à prefeitura");

		Endereco endereco2 = new Endereco();
		endereco2.setLogradouro("Av. Barão de Limeira");
		endereco2.setNumero("158");
		endereco2.setBairro("Santa Cecília");
		endereco2.setCidade("São Paulo");
		endereco2.setEstado(Estados.SAO_PAULO);
		endereco2.setComplemento("Escola");
		endereco2.setCep("06658-006");

		// Médicos
		Medico medico1 = new Medico();
		medico1.setNome("Ana Paula");
		medico1.setCrm("8956-98");
		medico1.setGenero(Genero.FEMININO);
		medico1.setDataDeNascimento(LocalDate.of(1997, 5, 15));

		// A Dra. Ana é Clínica geral e Fisioterapeuta
		Especialidade[] especialidades = { especialidade3, especialidade5 };
		medico1.setEspecialidades(especialidades);

		// Criar o Dr. Pedro Oliveria, nascido em 20/08/1984
		// trabalha com cardiologia, fisioterapia e clinica geral

		Medico medico2 = new Medico();
		medico2.setNome("Pedro Oliveria");
		medico2.setCrm("8146-06");
		medico2.setSexo("Masculino");
		medico2.setDataDeNascimento(LocalDate.of(1984, 8, 20));

		Especialidade[] especialidades2 = { especialidade1, especialidade3, especialidade5 };
		medico2.setEspecialidades(especialidades2);
//		System.out.println(especialidades2[0].getNome());

		// Criar dois pacientes, um no endereço 1 e outro no 2.
		Paciente paciente1 = new Paciente();
		paciente1.setNome("Layla Giovanna Furtado da Silva");
		paciente1.setEmail("laylagiovanna27@gmail.com");
		paciente1.setRg("50.128.581-7");
		paciente1.setCpf("451.022.128.26");
		paciente1.setTelefone("(11)97136-4704");
		paciente1.setSexo("Feminino");
		paciente1.setTipoSanguineo("O+");
		paciente1.setPlanoDeSaude(plano2);
		paciente1.setEndereco(endereco2);

		Paciente paciente2 = new Paciente();
		paciente2.setCpf("510.137.308-79");
		paciente2.setEmail("ingryddasilva7@gmail.com");
		paciente2.setEndereco(endereco1);
		paciente2.setNome("Ingryd");
		paciente2.setPlanoDeSaude(plano1);
		paciente2.setRg("52.463.646-1");
		paciente2.setSexo("Feminino");
		paciente2.setTelefone("(11)949676202");
		paciente2.setTipoSanguineo("a+");

		// exibir dados dos pacientes:
		// Nome
		// Cidade
		// Estado
		// Telefone
		// Operdora do plano de saude
		
//		System.out.println("Nome: " + paciente1.getNome());
//		System.out.println("Cidade: " + paciente1.getEndereco().getCidade());
//		System.out.println("Estado: " + paciente1.getEndereco().getEstado());
//		System.out.println("Telefone: " + paciente1.getTelefone());
//		System.out.println("Operadora do plano de saúde: " + paciente1.getPlanoDeSaude().getOperadora());
		
		
		//Agendamento de consulta para o paciente 1
		//este paciente preisa passar com: Clinico geral
		//No dia 22/09/2022, às 15h25
		
		Agenda agenda1 = new Agenda();
		agenda1.setPaciente(paciente1);
		agenda1.setMedico(medico2);
		agenda1.setEspecialidade(especialidade5);
		agenda1.setDataDaConsulta(LocalDate.of(2022, 9, 22));
		agenda1.setHoraDaConsulta(LocalTime.of(15, 25));
		
		System.out.println("-----------------Agenda:-----------------");
		System.out.println("Paciente: " + agenda1.getPaciente().getNome());
		System.out.println("Especialidade: " +  agenda1.getEspecialidade().getNome());
		System.out.println("Médico: " + agenda1.getMedico().getNome());
		System.out.println("Data da consulta: " + agenda1.getDataDaConsulta());
		System.out.println("Hora da consulta: " + agenda1.getHoraDaConsulta());	
		System.out.println("Plano de saúde: " + agenda1.getPaciente().getPlanoDeSaude().getOperadora());
		
		
		//Agendamento de consulta para o paciente 2
				//este paciente preisa passar com: Cardiologista
				//No dia 26/09/2022, às 09h00
		
		Agenda agenda2 = new Agenda();
		agenda2.setPaciente(paciente2);
		agenda2.setMedico(medico2);
		agenda2.setEspecialidade(especialidade1);
		agenda2.setDataDaConsulta(LocalDate.of(2022, 9, 26));
		agenda2.setHoraDaConsulta(LocalTime.of(9, 00));
		
		System.out.println("-----------------Agenda:-----------------");
		System.out.println("Paciente: " + agenda2.getPaciente().getNome());
		System.out.println("Especialidade: " +  agenda2.getEspecialidade().getNome());
		System.out.println("Médico: " + agenda2.getMedico().getNome());
		System.out.println("Data da consulta: " + agenda2.getDataDaConsulta());
		System.out.println("Hora da consulta: " + agenda2.getHoraDaConsulta());	
		System.out.println("Plano de saúde: " + agenda2.getPaciente().getPlanoDeSaude().getOperadora());
		
		
	}

}
