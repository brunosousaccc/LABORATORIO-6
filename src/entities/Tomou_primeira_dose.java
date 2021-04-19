package entities;

import vacina_interface.Estados_vacina;

public class Tomou_primeira_dose implements Estados_vacina {

	@Override
	public void hablitarPrimeiraDose(Pessoa pessoa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hablitarSegundaDose(Pessoa pessoa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void finalizarVacinacao(Pessoa pessoa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tomouPrimeiraDose(Pessoa pessoa) {
		pessoa.setEstado(this);

	}

}
