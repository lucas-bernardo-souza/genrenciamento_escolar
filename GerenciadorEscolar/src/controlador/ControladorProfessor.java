package controlador;

import java.util.ArrayList;
import java.util.Date;

import classes.Aluno;
import classes.Atividade;
import classes.Aula;
import classes.Disciplina;
import classes.Professor;

public class ControladorProfessor {
	private Professor professor;
	
	public ControladorProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public Aula registrarAula(Date data, String assuntoDaAula, String descricao) {
		 return professor.registrarAula(data, assuntoDaAula, descricao);
	}
	
	public Atividade criarAtivida(Date dataAtribuicao, Date dataEntrega, String descricao) {
		return professor.criarAtivida(dataAtribuicao, dataEntrega, descricao);
	}
	
	public void criarListaDePresenca(ArrayList<Aluno> alunos) {
		professor.criarListaDePresenca(alunos);
	}
	
	public void fazerComentarioPublico(String comentario, String nomeDisciplina) {
		professor.fazerComentarioPublico(comentario, nomeDisciplina);
	}
	
	public void comentarioPrivado(String nomeDisciplina, String deQuem, String paraQuem, String Mensagem) {
		professor.comentarioPrivado(nomeDisciplina, deQuem, paraQuem, Mensagem);
	}
	
	public Disciplina consultaDisciplina(String nome) {
		return professor.consultaDisciplina(nome);
	}
}
