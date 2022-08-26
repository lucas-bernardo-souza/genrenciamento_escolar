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
        private ArrayList<Disciplina> disciplinas;
        
        public Controlador(Coordenador coordenador) {
            this.coordenador = coordenador;
        }
	
        public Controlador(Coordenador coordenador, Professor professor) {
            this.coordenador = coordenador;
            this.professor = professor;
        }
        
        public Controlador(Coordenador coordenador, Professor professor, Aluno aluno) {
            this.coordenador = coordenador;
            this.professor = professor;
            this.aluno = aluno;
        }
        /*
	public Controlador(Coordenador coordenador) {
		this.coordenador = coordenador;
	}
	
	public Controlador(Professor professor) {
		this.professor = professor;
	}
	
	public Controlador(Aluno aluno) {
		this.aluno = aluno;
	}
	*/
	public void cadastrarAluno(String nome, String cpf, String registroEscolar) {
		Aluno alu = coordenador.criaAluno(nome, cpf, registroEscolar);
	}
	
	public void cadastrarProfessor(String nome, String cpf, String area, String titulacao) {
		Professor prof = coordenador.criaProfessor(nome, cpf, area, titulacao);
	}
	
	public void cadastrarDisciplina(String nome, Professor professor, PlanoPedagogico planoPedagogico) {
		coordenador.criaDisciplina(nome, professor, planoPedagogico);
	}
	
	public void cadastrarPlanoPedagogico(int cargahoraria) {
		coordenador.criaPlanoPedagogico(cargahoraria);
	}
	
	public void removerAluno(String cpf) {
		coordenador.removeAluno(cpf);
	}
	
	public void removerProfessor(String cpf) {
		coordenador.removeProfessor(cpf);
	}
	
	public void registrarAula(Date data, String assuntoDaAula, String descricao) {
		Aula al = professor.registrarAula(data, assuntoDaAula, descricao);
	}
	
	public void criarAtivida(Date dataAtribuicao, Date dataEntrega, String descricao) {
		Atividade atv = professor.criarAtivida(dataAtribuicao, dataEntrega, descricao);
	}
	
	public void criarListaDePresença(ArrayList<Aluno> alunos) {
		professor.criarListaDePresença(alunos);
	}
	
	public void fazerComentarioPublico(String comentario, String nomeDisciplina) {
		professor.fazerComentarioPublico(comentario, nomeDisciplina);
	}
	
	public void comentarioPrivado(String nomeDisciplina, String deQuem, String paraQuem, String Mensagem) {
		professor.comentarioPrivado(nomeDisciplina, deQuem, paraQuem, Mensagem);
	}
	
	public void consultaDisciplina(String nome) {
		Disciplina disc = professor.consultaDisciplina(nome);
	}
	
	public void inscreverEmDisciplina(Disciplina disc) {
		aluno.matricularEmDisciplina(disc);
	}
	
	public void concluirAtividade() {
		aluno.concluirAtividade();
	}
	
	public void consultarDisciplinasMatriculadas(){
		aluno.getDisciplinasMatriculadas();
	}

        public void consultarAtividades() {
                aluno.consultarAtividade();
        }

        public void consultarNotas() {
                aluno.consultarNota();
        }

        public void consultarFaltas() {
                aluno.consultarFalta();
        }
}
