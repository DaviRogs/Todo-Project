package models;

public class Frontend extends Usuario {

	private int id;

	private int tempoespecializacao;

	public Frontend(String nomePe, String cpfPe, int idadePe, int tempEsp) {
		nomePessoa = nomePe;
		cpf = cpfPe;
		idade = idadePe;
		this.id = (this.id + 1);
		this.tempoespecializacao = tempEsp;
	}

	public String deletarFrontend() {
		return ("Pessoa do Frontend deletada com sucesso!");
	}

	public void editarFrontend(int teEs) {
		this.tempoespecializacao = teEs;
	}

	public String getFrontend() {
		return nomePessoa + " " + this.tempoespecializacao + " meses";
	}

	public int getId() {
		return id;

	}

}
