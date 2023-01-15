package models;

public class Fullstack extends Usuario {
		
	private int id;

	private int tempoespecializacao;

	public Fullstack(String nomePe, String cpfPe, int idadePe, int tempEsp) {
		nomePessoa = nomePe;
		cpf = cpfPe;
		idade = idadePe;
		this.id = (this.id + 1);
		this.tempoespecializacao = tempEsp;
	}

	public String deletarFullstack() {
		return ("Pessoa deletada com sucesso!");
	}

	public void editarFullstack(String teEs) {

	}

	public String getFullstack() {
		return nomePessoa + " " + this.tempoespecializacao + " meses";
	}

	public int getId() {
		return id;
	}
}
