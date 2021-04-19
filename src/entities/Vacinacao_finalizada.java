package entities;

import vacina_interface.Estados_vacina;

public class Vacinacao_finalizada implements Estados_vacina {

	@Override
	public void hablitarPrimeiraDose(Pessoa pessoa) {
	}

	@Override
	public void tomouPrimeiraDose(Pessoa pessoa) {
	}

	@Override
	public void hablitarSegundaDose(Pessoa pessoa) {
	}

	@Override
	public void finalizarVacinacao(Pessoa pessoa) {
		if(pessoa.getEstado() instanceof Habilitada_segunda_dose){
			pessoa.setEstado(this);
	}}

}
