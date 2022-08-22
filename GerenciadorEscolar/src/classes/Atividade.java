package classes;

import java.util.Date;

public class Atividade {
	private Date dataAtribuicao;
	private Date dataEntrega;
	private String descricao;
	private float nota;
	private Aluno aluno;
	private boolean pendente;
	
	public Atividade(Date dataAtribuicao, Date dataEntrega, String descricao) {
		this.dataAtribuicao = dataAtribuicao;
		this.dataEntrega = dataEntrega;
		this.descricao = descricao;
		pendente = true;
	}
	
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
		return;
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public Date getDataAtribuicao() {
		return dataAtribuicao;
	}

	public Date getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	public boolean isPendente() {
		return pendente;
	}

	public void setPendente(boolean pendente) {
		this.pendente = pendente;
	}
	
}
