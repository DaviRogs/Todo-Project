package models;

public class Atividade {

	private String nomeAtividade;

	private boolean situacaoAtividade;

	private Projeto projeto;

	private Frontend[] frontend;

	private Backend[] backend;

	private Fullstack[] fullstack;

	public Atividade(String nomeAt, boolean situAt) {
		this.nomeAtividade = nomeAt;
		situAt = false;
		this.situacaoAtividade = situAt;
	}

	public String deletarAtividade() {
		return ("Atividade deletada com sucesso!");
	}

	public void editarAtividade(String noAt) {
		this.nomeAtividade = noAt;
	}

	public void detalharAtividade() {

	}

	public void definirSituacao(boolean situacaoAt) {
		if(this.situacaoAtividade = false) {
			situacaoAt = true;
		}
		else {
			situacaoAt = false;
		}
		
		this.situacaoAtividade = situacaoAt;
	}

	public String getAtividade() {
		if (this.situacaoAtividade == false) {
			return(nomeAtividade + "/n" + "Essa atividade ainda está sendo feita.");
		}
		else {
			return(this.nomeAtividade + "/n" + "Essa atividade já foi realizada");
		}

	}

}
