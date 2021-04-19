package vacina_interface;

import entities.Pessoa;

public interface Estados_vacina {

	public void hablitarPrimeiraDose(Pessoa pessoa);
	
	public void tomouPrimeiraDose(Pessoa pessoa);
	
	//public void hablitarPrimeiraDose(Pessoa pessoa);
	
	public void hablitarSegundaDose(Pessoa pessoa);
	
	public void finalizarVacinacao(Pessoa pessoa);
	
}
