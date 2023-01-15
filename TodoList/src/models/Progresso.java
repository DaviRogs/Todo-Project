package models;

public class Progresso {

	private String descricaoAndamento;

	private boolean situacaoAndamento;

	private Atividade atividade;

	public Progresso(String nomeA) {
		this.situacaoAndamento = false;
		this.descricaoAndamento = nomeA;
	}

	public String deletarAndamento() {
		return ("Este andamento foi excluído com sucesso!");
	}

	public void editarAndamento(String noA) {
		this.descricaoAndamento = noA;
	}

	public void definirSituacao(boolean situacaoA) {
		if(this.situacaoAndamento = false) {
			situacaoA = true;
		}
		else {
			situacaoA = false;
		}
		this.situacaoAndamento = situacaoA;
	}

	public String getAndamento() {
		if(this.situacaoAndamento == false) {
			return (this.descricaoAndamento + "-> Sua atividade ainda está sendo realizada.");
		}
		else {
			return (this.descricaoAndamento + "-> Sua atividade já foi realizada.");
		}

	}

}
