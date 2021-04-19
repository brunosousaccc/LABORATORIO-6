package entities;

import vacina_interface.Estados_vacina;

public class Pessoa {

	private String nome;
	private long CPF;
	private String idade;
	private String endereco;
	private long numeroSus;
	private String email;
	private long telefone;
	private String profissap;
	private String comorbidades;
	private Estados_vacina estado = new Nao_habilitada();
	private int diasPrimeiraDose = 0;
	
	
	
	
	public Pessoa() {
	}


	public Pessoa(String nome, long cPF, String idade, String endereco, long numeroSus, String email, long telefone,
			String profissap, String comorbidades) {
		super();
		this.nome = nome;
		CPF = cPF;
		this.idade = idade;
		this.endereco = endereco;
		this.numeroSus = numeroSus;
		this.email = email;
		this.telefone = telefone;
		this.profissap = profissap;
		this.comorbidades = comorbidades;
	}


	public String getIdade() {
		return idade;
	}


	public void setIdade(String idade) {
		this.idade = idade;
	}


	public int getDiasPrimeiraDose() {
		return diasPrimeiraDose;
	}


	public void setDiasPrimeiraDose(int diasPrimeiraDose) {
		this.diasPrimeiraDose = diasPrimeiraDose;
	}

	
	public void setEstado(Estados_vacina estado) {
		this.estado = estado;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public long getCPF() {
		return CPF;
	}


	public void setCPF(long cPF) {
		CPF = cPF;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public long getNumeroSus() {
		return numeroSus;
	}


	public void setNumeroSus(long numeroSus) {
		this.numeroSus = numeroSus;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getTelefone() {
		return telefone;
	}


	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}


	public String getProfissap() {
		return profissap;
	}


	public void setProfissap(String profissap) {
		this.profissap = profissap;
	}


	public String getComorbidades() {
		return comorbidades;
	}


	public void setComorbidades(String comorbidades) {
		this.comorbidades = comorbidades;
	}


	public Estados_vacina getEstado() {
		return estado;
	}


	@Override
	public String toString() {
		return "Nome= " + nome + ", estado= " + estado + "]";
	}
	
	
	
	
	
}
