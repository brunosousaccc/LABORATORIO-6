package entities;

import vacina_interface.Estados_vacina;


public class Habilitada_primeira_dose implements Estados_vacina  {

	@Override
	public void hablitarPrimeiraDose(Pessoa pessoa) {
		if(pessoa.getComorbidades() == "sim" || pessoa.getProfissap() == "sim" || pessoa.getIdade() == "sim") {
			System.out.println("Pessoa habilitada");
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
