package models;

public class Projeto {

	private String nomeProjeto;

	private String subtituloProjeto;

	private Fullstack fullstack;

	public Projeto(String nomeP, String subtP) {
		this.nomeProjeto = nomeP;
		this.subtituloProjeto = subtP;
	}

	public String deletarProjeto() {
		return ("Projeto deletado cokm sucesso!");
	}

	public void editarProjeto(String noP, String sbP) {
		this.nomeProjeto = noP;
		this.subtituloProjeto = sbP;
	}

	public void detalharProjeto() {
		
	}

	public String getProjeto() {
		return (this.nomeProjeto + " -> " +  this.subtituloProjeto);

	}

}
