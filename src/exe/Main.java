package exe;

import java.util.Scanner;

import entities.Habilitada_primeira_dose;
import entities.Habilitada_segunda_dose;
import entities.Pessoa;
import entities.Tomou_primeira_dose;
import entities.Vacinacao_finalizada;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa pessoa1 = new Pessoa();
		/*
		 System.out.println("NOME? ");
		 String nome = sc.nextLine();
		 System.out.println("CPF? ");
		 long CPF = sc.nextLong();
		 System.out.println("IDADE DE RISCO? ");
		 sc.nextLine();
		 String idade = sc.nextLine();
		 System.out.println("ENDERECO? ");
		 String endereco = sc.nextLine();
		 //sc.nextLine();
		 System.out.println("NUMERO SUS? ");
		 long numeroSus = sc.nextLong();
		 System.out.println("EMAIL? ");
		 String email = sc.nextLine();
		 sc.nextLine();
		 System.out.println("TELEFONE? ");
		 long telefone = sc.nextLong();
		 System.out.println("PROFISSAO DE RISCO? ");
		 String profissap = sc.nextLine();
		 sc.nextLine();
		 System.out.println("POSSUI COMORBIDADES? ");
		 String comorbidades = sc.nextLine();
		 
		 pessoa1.setNome(nome);
		 pessoa1.setComorbidades(comorbidades);
		 pessoa1.getCPF();
		 pessoa1.setIdade(idade);
		 pessoa1.setEndereco(endereco);
		 pessoa1.setEmail(email);
		 pessoa1.setNumeroSus(numeroSus);
		 pessoa1.setTelefone(telefone);
		 pessoa1.setProfissap(profissap);
		*/
		
		Pessoa pessoa = new Pessoa("Bruno", 1212, "sim", "n", 1213,"n",2121,"n","nb");
		
		Habilitada_primeira_dose h1 = new Habilitada_primeira_dose();
		Habilitada_segunda_dose h2 = new Habilitada_segunda_dose();
		Tomou_primeira_dose t1 = new Tomou_primeira_dose();
		Vacinacao_finalizada v1 = new Vacinacao_finalizada();
		
		System.out.println("PESSOA 1");
		h1.hablitarPrimeiraDose(pessoa);
		System.out.println(pessoa.toString());
		t1.tomouPrimeiraDose(pessoa);
		System.out.println(pessoa.toString());
		pessoa.setDiasPrimeiraDose(21);
		h2.hablitarSegundaDose(pessoa);		
		System.out.println(pessoa.toString());
		v1.finalizarVacinacao(pessoa);
		System.out.println(pessoa.toString());
		
		/*
		
		System.out.println("PESSOA 2");
		h1.hablitarPrimeiraDose(pessoa1);
		System.out.println(pessoa1.toString());
		t1.tomouPrimeiraDose(pessoa1);
		System.out.println(pessoa1.toString());
		pessoa.setDiasPrimeiraDose(21);
		System.out.println(pessoa1.toString());
		h2.hablitarSegundaDose(pessoa1);		
		System.out.println(pessoa1.toString());
		v1.finalizarVacinacao(pessoa1);
		System.out.println(pessoa1.toString());
		*/

	}

}
