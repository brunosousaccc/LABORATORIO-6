package entities;

import vacina_interface.Estados_vacina;

public class Habilitada_segunda_dose implements Estados_vacina  {

	@Override
	public void hablitarPrimeiraDose(Pessoa pessoa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hablitarSegundaDose(Pessoa pessoa) {
		if((pessoa.getDiasPrimeiraDose() > 20) && (pessoa.getEstado() instanceof Tomou_primeira_dose)) {
			pessoa.setEstado(this);
		}
	}

	@Override
	public void finalizarVacinacao(Pessoa pessoa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tomouPrimeiraDose(Pessoa pessoa) {
		// TODO Auto-generated method stub
		
	}

}
