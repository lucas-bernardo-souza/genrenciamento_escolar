package controlador;


import java.util.ArrayList;
import java.util.Date;

import classes.Aluno;
import classes.Coordenador;
import classes.Disciplina;
import classes.PlanoPedagogico;
import classes.Professor;

public class Controlador {
	private ControladorCoordenador ctrlCoordenador;
	private ControladorProfessor ctrlProfessor;
	private ControladorAluno ctrlAluno;
	private Aluno aluno;
	private Professor professor;
	private Disciplina disciplina;
//    private ArrayList<Disciplina> disciplinas;
    
    public Controlador(Coordenador coordenador) {
        ctrlCoordenador = new ControladorCoordenador(coordenador);
        ctrlProfessor = new ControladorProfessor();
        ctrlAluno = new ControladorAluno();
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
		aluno = ctrlCoordenador.cadastrarAluno(nome, cpf, registroEscolar);
		ctrlAluno.addAluno(aluno);
	}
	
	public void cadastrarProfessor(String nome, String cpf, String area, String titulacao) {
		professor = ctrlCoordenador.cadastrarProfessor(nome, cpf, area, titulacao);
		ctrlProfessor.addProfessor(professor);
	}
	
	public void cadastrarDisciplina(String nome, String cpfProfessor, PlanoPedagogico planoPedagogico) {
		professor = ctrlProfessor.buscaProfessor(cpfProfessor);
		disciplina = ctrlCoordenador.cadastrarDisciplina(nome, professor, planoPedagogico);
		ctrlProfessor.cadastrarDisciplina(disciplina);
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
	
	public void registrarAula(Date data, String assuntoDaAula, String descricao, String cpfProfessor, String nomeDisciplina) {
		ctrlProfessor.registrarAula(data, assuntoDaAula, descricao, cpfProfessor, nomeDisciplina);
	}
	
	public void criarAtivida(Date dataAtribuicao, Date dataEntrega, String descricao, String cpfProfessor, String nomeDisciplina, String assuntoAula) {
		ctrlProfessor.criarAtividade(dataAtribuicao, dataEntrega, descricao, cpfProfessor, nomeDisciplina, assuntoAula);
	}
	
	public void criarListaDePresenca(ArrayList<Aluno> alunos, String cpfProfessor) {
		ctrlProfessor.criarListaDePresenca(alunos, cpfProfessor);
	}
	
	public void fazerComentarioPublico(String comentario, String nomeDisciplina, String cpfProfessor) {
		ctrlProfessor.fazerComentarioPublico(comentario, nomeDisciplina, cpfProfessor);
	}
	
	public void comentarioPrivado(String nomeDisciplina, String deQuem, String paraQuem, String Mensagem, String cpfProfessor) {
		ctrlProfessor.comentarioPrivado(nomeDisciplina, deQuem, paraQuem, Mensagem, cpfProfessor);
	}
	
	public Disciplina consultaDisciplina(String nome, String cpfProfessor) {
		return ctrlProfessor.consultaDisciplina(nome, cpfProfessor);
	}
	
	public void inscreverEmDisciplina(Disciplina disc, String cpf) {
		ctrlAluno.inscreverEmDisciplina(disc, cpf);
	}
	
	public void concluirAtividade(String cpf) {
		ctrlAluno.concluirAtividade(cpf);
	}
	
	public void consultarDisciplinasMatriculadas(String cpf){
		ctrlAluno.consultarDisciplinasMatriculadas(cpf);
	}

    public void consultarAtividades(String cpf) {
        ctrlAluno.consultarAtividades(cpf);
    }

    public void consultarNotas(String cpf) {
        ctrlAluno.consultarNotas(cpf);
    }

    public void consultarFaltas(String cpf) {
        ctrlAluno.consultarFaltas(cpf);
    }
}
