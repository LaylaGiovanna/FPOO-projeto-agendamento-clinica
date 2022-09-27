package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteArrayList {

	public static void main(String[] args) {

		PlanoDeSaude plano1 = new PlanoDeSaude("Amil", "Basic");
		PlanoDeSaude plano2 = new PlanoDeSaude("Allianz", "Bronze");
		PlanoDeSaude plano3 = new PlanoDeSaude("Unimed", "Prata");
		PlanoDeSaude plano4 = new PlanoDeSaude("Notredame", "Advanced");
		
		
		ArrayList<PlanoDeSaude> planos = new ArrayList<>();
		planos.add(plano1);
		planos.add(plano2);
		planos.add(plano3);
		planos.add(plano4);
		planos.add(plano1);
		planos.add(plano3);
		
		System.out.println("--------------WHILE--------------");
		int i = 0;
		while (i < planos.size()) {
			System.out.println(planos.get(i).getOperadora());
			i++;
		}
		
		System.out.println("Saiu do looping!!");
		
		
//		for(contador;condição;acumulador) {
//			
//		}
		System.out.println("--------------UTILIZANDO O FOR--------------");
		for(int contador = 0; contador < planos.size(); contador++) {
			System.out.println(planos.get(contador).getOperadora());
		}
		
		//ITERAÇÃO em listas - ArrayList<>
		System.out.println("--------------FOR EACH - PARA CADA--------------");
		for(PlanoDeSaude plano : planos) {
			System.out.println(plano.getOperadora());
		}
		
		
		//criar 3 especialidades, guardar as especialidades em um ArrayList 
		//e exibir o nome das especialidades usando o for each
		
		System.out.println("--------------FAZENDO COM ESPECIALIDADES--------------");
		Especialidade especialidade1 = new Especialidade();
		especialidade1.setNome("Cardiologista");
		especialidade1.setDescricao("Cuida do coração");
		
		Especialidade especialidade2 = new Especialidade();
		especialidade2.setNome("Otorrino");
		especialidade2.setDescricao("Cuida do ouvido");
		
		Especialidade especialidade3 = new Especialidade();
		especialidade3.setNome("Fisioterapeuta");
		especialidade3.setDescricao("Cuida dos ossos e dos musculos");
		
		ArrayList<Especialidade> especialidades = new ArrayList<>();
		especialidades.add(especialidade1);
		especialidades.add(especialidade2);
		especialidades.add(especialidade3);
		
		for(Especialidade especialidade : especialidades) {
			System.out.printf("%s --> %s \n", especialidade.getNome(), especialidade.getDescricao());
		}
		
		
		
		
		
		
		
		
//		PlanoDeSaudeDAO dao = new PlanoDeSaudeDAO();
//		dao.gravar(plano1);
//		dao.gravar(plano2);
//
//		System.out.println(dao.listarTodos());
//		
//		vetor com 3 planos de saúde
//		PlanoDeSaude plano1 = new PlanoDeSaude();
//		plano1.setOperadora("Unimed");
//		plano1.setTipoDoPlano("Bronze");
//
//		PlanoDeSaude[] planos = { plano1, new PlanoDeSaude("Porto Seguro"), new PlanoDeSaude("Allianz", "Ouro") };
//
//		System.out.println(planos[0].getOperadora());
//		System.out.println(planos[0].getTipoDoPlano());
//		System.out.println(planos[1].getOperadora());
//		System.out.println(planos[1].getTipoDoPlano());
//		System.out.println(planos[2].getOperadora());
//		System.out.println(planos[2].getTipoDoPlano());
//
//		utilização do ArrayList
//		ArrayList<String> cidades = new ArrayList<>();
//		cidades.add("São Paulo");
//		cidades.add("Jandira");
//		cidades.add("Barueri");
//		cidades.add("Itapevi");
//		cidades.add("Cotia");
//		cidades.add("Carapicuíba");
//
//		System.out.println(cidades.get(5));
//
//		ArrayList<PlanoDeSaude> planos2 = new ArrayList<>();
//		planos2.add(new PlanoDeSaude("Notredame"));
//		planos2.add(new PlanoDeSaude("Ativia", "Advanced"));
//		planos2.add(new PlanoDeSaude("Bio Saúde"));
//		planos2.add(new PlanoDeSaude("Blue Med", "Exclusive"));
//
//		PlanoDeSaude planoNovo = new PlanoDeSaude();
//		planoNovo.setOperadora("Ameplan");
//		planoNovo.setTipoDoPlano("Prata");
//
//		planos2.add(planoNovo);
//
//		// adicionar o tipo do plano no plano Notredame
//		planos2.get(0).setTipoDoPlano("Basic");
//
//		System.out.println(planos2.get(4).getDadosDoPlano());
//		System.out.println(planos2.get(0).getDadosDoPlano());
//		
//		
//		
//		int nota1 = 10;
//		Integer nota2 = 5;
//		
//		ArrayList<Double> precosList = new ArrayList<>();
//		precosList.add(5.9);

	}

}
