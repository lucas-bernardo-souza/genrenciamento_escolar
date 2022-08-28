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
	private ControladorCoordenador ctrlCoordenador;
	private ControladorProfessor ctrlProfessor;
	private ControladorAluno ctrlAluno;
//    private ArrayList<Disciplina> disciplinas;
        
        public Controlador(Coordenador coordenador) {
        	ctrlCoordenador = new ControladorCoordenador(coordenador);
        }
	
        public Controlador(Coordenador coordenador, Professor professor) {
            ctrlCoordenador = new ControladorCoordenador(coordenador);
            ctrlProfessor = new ControladorProfessor(professor);
        }
        
        public Controlador(Coordenador coordenador, Professor professor, Aluno aluno) {
            ctrlCoordenador = new ControladorCoordenador(coordenador);
            ctrlProfessor = new ControladorProfessor(professor);
            ctrlAluno = new ControladorAluno(aluno);
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
	public Aluno cadastrarAluno(String nome, String cpf, String registroEscolar) {
		return ctrlCoordenador.cadastrarAluno(nome, cpf, registroEscolar);
	}
	
	public Professor cadastrarProfessor(String nome, String cpf, String area, String titulacao) {
		return ctrlCoordenador.cadastrarProfessor(nome, cpf, area, titulacao);
	}
	
	public void cadastrarDisciplina(String nome, Professor professor, PlanoPedagogico planoPedagogico) {
		ctrlCoordenador.cadastrarDisciplina(nome, professor, planoPedagogico);
	}
	
	public void cadastrarPlanoPedagogico(int cargahoraria) {
		ctrlCoordenador.cadastrarPlanoPedagogico(cargahoraria);
	}
	
	public void removeAluno(String cpf) {
		ctrlCoordenador.removeAluno(cpf);
	}
	
	public void removeProfessor(String cpf) {
		ctrlCoordenador.removeProfessor(cpf);
	}
	
	public Aula registrarAula(Date data, String assuntoDaAula, String descricao) {
		return ctrlProfessor.registrarAula(data, assuntoDaAula, descricao);
	}
	
	public Atividade criarAtivida(Date dataAtribuicao, Date dataEntrega, String descricao) {
		return ctrlProfessor.criarAtivida(dataAtribuicao, dataEntrega, descricao);
	}
	
	public void criarListaDePresenca(ArrayList<Aluno> alunos) {
		ctrlProfessor.criarListaDePresenca(alunos);
	}
	
	public void fazerComentarioPublico(String comentario, String nomeDisciplina) {
		ctrlProfessor.fazerComentarioPublico(comentario, nomeDisciplina);
	}
	
	public void comentarioPrivado(String nomeDisciplina, String deQuem, String paraQuem, String Mensagem) {
		ctrlProfessor.comentarioPrivado(nomeDisciplina, deQuem, paraQuem, Mensagem);
	}
	
	public Disciplina consultaDisciplina(String nome) {
		return ctrlProfessor.consultaDisciplina(nome);
	}
	
	public void inscreverEmDisciplina(Disciplina disc) {
		ctrlAluno.inscreverEmDisciplina(disc);
	}
	
	public void concluirAtividade() {
		ctrlAluno.concluirAtividade();
	}
	
	public void consultarDisciplinasMatriculadas(){
		ctrlAluno.consultarDisciplinasMatriculadas();
	}

    public void consultarAtividades() {
        ctrlAluno.consultarAtividades();
    }

    public void consultarNotas() {
        ctrlAluno.consultarNotas();
    }

    public void consultarFaltas() {
        ctrlAluno.consultarFaltas();
    }
}
