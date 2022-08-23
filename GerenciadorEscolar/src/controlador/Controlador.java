package controlador;


import java.util.ArrayList;
import java.util.Date;

import classes.Aluno;
import classes.Atividade;
import classes.Aula;
import classes.Coordenador;
import classes.Disciplina;
import classes.PlanoPedagogico;
import classes.Professor;

public class Controlador {
	private Coordenador coordenador;
	private Professor professor;
	private Aluno aluno;
	
	public Controlador(Coordenador coordenador) {
		this.coordenador = coordenador;
	}
	
	public Controlador(Professor professor) {
		this.professor = professor;
	}
	
	public Controlador(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public Aluno cadastrarAluno(String nome, String cpf, String registroEscolar) {
		Aluno alu = coordenador.criaAluno(nome, cpf, registroEscolar);
		return alu;
	}
	
	public Professor cadastrarProfessor(String nome, String cpf, String area, String titulacao) {
		Professor prof = coordenador.criaProfessor(nome, cpf, area, titulacao);
		return prof;
	}
	
	public void cadastrarDisciplina(String nome, Professor professor, PlanoPedagogico planoPedagogico) {
		coordenador.criaDisciplina(nome, professor, planoPedagogico);
		return;
	}
	
	public void cadastrarPlanoPedagogico(int cargahoraria) {
		coordenador.criaPlanoPedagogico(cargahoraria);
		return;
	}
	
	public Aluno removerAluno(String cpf) {
		coordenador.removeAluno(cpf);
		return null;
	}
	
	public Professor removerProfessor(String cpf) {
		coordenador.removeProfessor(cpf);
		return null;
	}
	
	public void registrarAula(Date data, String assuntoDaAula, String descricao) {
		Aula al = professor.registrarAula(data, assuntoDaAula, descricao);
		return;
	}
	
	public void criarAtivida(Date dataAtribuicao, Date dataEntrega, String descricao) {
		Atividade atv = professor.criarAtivida(dataAtribuicao, dataEntrega, descricao);
		return;
	}
	
	public void criarListaDePresença(ArrayList<Aluno> alunos) {
		professor.criarListaDePresença(alunos);
		return;
	}
	
	public void fazerComentarioPublico(String comentario, String nomeDisciplina) {
		professor.fazerComentarioPublico(comentario, nomeDisciplina);
		return;
	}
	
	public void comentarioPrivado(String nomeDisciplina, String deQuem, String paraQuem, String Mensagem) {
		professor.comentarioPrivado(nomeDisciplina, deQuem, paraQuem, Mensagem);
		return;
	}
	
	public Disciplina consultaDisciplina(String nome) {
		Disciplina disc = professor.consultaDisciplina(nome);
		return disc;
	}
	
	public void inscreverEmDisciplina(Disciplina disc) {
		aluno.matricularEmDisciplina(disc);
		return;
	}
	
	public void concluirAtividade() {
		aluno.concluirAtividade();
		return;
	}
	
	public ArrayList<Disciplina> consultarDisciplinasMatriculadas(){
		return aluno.getDisciplinasMatriculadas();
	}
}
