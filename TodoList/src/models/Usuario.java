package models;

public abstract class Usuario {

	protected String nomePessoa;

	protected String cpf;

	protected int idade;

	public String deletarPessoa() {
		return ("Pessoa deletada com sucesso!");
	}

	public void editarPessoa(String noPe, String cPe, String iddPe) {

	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public String getCpf() {
		return cpf;
	}

	public int getIdade() {
		return idade;

	}

}
