package entities;

import vacina_interface.Estados_vacina;

public class Vacinacao_finalizada implements Estados_vacina {

	@Override
	public void hablitarPrimeiraDose(Pessoa pessoa) {
		System.out.println("Vacina��o j� finalizada");		
	}

	@Override
	public void tomouPrimeiraDose(Pessoa pessoa) {
		System.out.println("Vacina��o j� finalizada");		
	}

	@Override
	public void hablitarSegundaDose(Pessoa pessoa) {
		System.out.println("Vacina��o j� finalizada");
	}

	@Override
	public void finalizarVacinacao(Pessoa pessoa) {
		pessoa.setEstado(this);
	}

}
