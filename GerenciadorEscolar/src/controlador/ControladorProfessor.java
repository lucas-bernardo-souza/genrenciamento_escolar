package controlador;

import java.util.ArrayList;
import java.util.Date;

import classes.Aluno;
import classes.Disciplina;
import classes.Professor;

public class ControladorProfessor {
	private Professor professor;
	private ArrayList<Professor> professores;
	
	public ControladorProfessor() {
		professores = new ArrayList<Professor>();
	}
	
	public void addProfessor(Professor professor) {
		professores.add(professor);
	}
	
	public Professor buscaProfessor(String cpf) {
		for(int i = 0; i < professores.size(); i++) {
			if(professores.get(i).getCpf() == cpf) {
				professor = professores.get(i);
			}
		}
		return professor;
	}
	
	public void cadastrarDisciplina(Disciplina disciplina) {
		professor = disciplina.getProfessor();
		professor.addDisciplina(disciplina);
	}
	
	public void registrarAula(Date data, String assuntoDaAula, String descricao, String cpf, String nomeDisciplina) {
		for(int i = 0; i < professores.size(); i++) {
			if(professores.get(i).getCpf() == cpf) {
				professor = professores.get(i);
			}
		} 
		professor.registrarAula(data, assuntoDaAula, descricao, nomeDisciplina);
	}
	
	public void criarAtividade(Date dataAtribuicao, Date dataEntrega, String descricao, String cpf, String nomeDisciplina, String assuntoAula) {
		for(int i = 0; i < professores.size(); i++) {
			if(professores.get(i).getCpf() == cpf) {
				professor = professores.get(i);
			}
		} 
		professor.criarAtivida(dataAtribuicao, dataEntrega, descricao, nomeDisciplina, assuntoAula);
	}
	
	public void criarListaDePresenca(ArrayList<Aluno> alunos, String cpf) {
		for(int i = 0; i < professores.size(); i++) {
			if(professores.get(i).getCpf() == cpf) {
				professor = professores.get(i);
			}
		} 
		professor.criarListaDePresenca(alunos);
	}
	
	public void fazerComentarioPublico(String comentario, String nomeDisciplina, String cpf) {
		for(int i = 0; i < professores.size(); i++) {
			if(professores.get(i).getCpf() == cpf) {
				professor = professores.get(i);
			}
		} 
		professor.fazerComentarioPublico(comentario, nomeDisciplina);
	}
	
	public void comentarioPrivado(String nomeDisciplina, String deQuem, String paraQuem, String Mensagem, String cpf) {
		for(int i = 0; i < professores.size(); i++) {
			if(professores.get(i).getCpf() == cpf) {
				professor = professores.get(i);
			}
		} 
		professor.comentarioPrivado(nomeDisciplina, deQuem, paraQuem, Mensagem);
	}
	
	public Disciplina consultaDisciplina(String nome, String cpf) {
		for(int i = 0; i < professores.size(); i++) {
			if(professores.get(i).getCpf() == cpf) {
				professor = professores.get(i);
			}
		} 
		return professor.consultaDisciplina(nome);
	}
}
