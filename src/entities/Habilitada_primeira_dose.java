package entities;

import vacina_interface.Estados_vacina;


public class Habilitada_primeira_dose implements Estados_vacina  {

	@Override
	public void hablitarPrimeiraDose(Pessoa pessoa) {
		if((pessoa.getComorbidades().equalsIgnoreCase("sim") || pessoa.getProfissap().equalsIgnoreCase("sim") || pessoa.getIdade().equalsIgnoreCase("sim"))  && (pessoa.getEstado() instanceof Nao_habilitada ) ){
			pessoa.setEstado(this);}
		
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
		
		
	}

}
