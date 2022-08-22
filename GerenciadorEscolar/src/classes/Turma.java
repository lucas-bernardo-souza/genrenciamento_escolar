package classes;

import java.util.ArrayList;

public class Turma {
	private int ano;
	private int serie;
	private ArrayList<Aluno> alunos;
	private ArrayList<Disciplina> disciplinas;
	
	public Turma(int ano, int serie) {
		this.ano = ano;
		this.serie = serie;
		alunos = new ArrayList<Aluno>();
		disciplinas = new ArrayList<Disciplina>();
	}
	
	public void addAluno(Aluno aluno) {
		alunos.add(aluno);
		return;
	}
	
	public void addDisciplina(Disciplina disciplina) {
		disciplinas.add(disciplina);
		return;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}
	
	public ArrayList<Aluno> getAlunos(){
		return alunos;
	}
	
	public ArrayList<Disciplina> getDisciplinas(){
		return disciplinas;
	}
}

