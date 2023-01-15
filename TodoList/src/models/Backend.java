package models;

public class Backend extends Usuario {

	private int id;

	private int tempoespecializacao;

	public Backend(String nomePe, String cpfPe, int idadePe, int tempEsp) {
		nomePessoa = nomePe;
		cpf = cpfPe;
		idade = idadePe;
		this.id = (this.id + 1);
		this.tempoespecializacao = tempEsp;
	}

	public String deletarBackend() {
		return ("Pessoa deletada com sucesso!");
	}

	public void editarBackend(String teEs) {

	}

	public String getBackend() {
		return nomePessoa + " " + this.tempoespecializacao + " meses";
	}

	public int getId() {
		return id;
	}

}
