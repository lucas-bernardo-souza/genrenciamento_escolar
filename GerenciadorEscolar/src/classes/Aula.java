package classes;

import java.util.ArrayList;
import java.util.Date;

public class Aula {
	private Date data;
	private String assuntoDaAula;
	private String descricao;
	private ArrayList<Aluno> listaDePresenca;
	private ArrayList<Atividade> listaDeAtividades;
	
	public Aula(Date data, String assuntoDaAula, String descricao) {
		this.data = data;
		this.assuntoDaAula = assuntoDaAula;
		this.descricao = descricao;
		listaDePresenca = new ArrayList<Aluno>();
		listaDeAtividades = new ArrayList<Atividade>();
	}
	
	public ArrayList<Atividade> getListaDeAtividades() {
		return listaDeAtividades;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getassuntoDaAula() {
		return assuntoDaAula;
	}

	public void setassuntoDaAula(String assuntoDaAula) {
		this.assuntoDaAula = assuntoDaAula;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void addPresenca(Aluno aluno) {
		listaDePresenca.add(aluno);
		return;
	}
	
	public ArrayList<Aluno> getPresenca(){
		return listaDePresenca;
	}
	
	public boolean presencaAluno(Aluno aluno) {
		//Retorna true caso o aluno esteja presente na aula ou false caso contrário
		return listaDePresenca.contains(aluno);
	}
	
}
