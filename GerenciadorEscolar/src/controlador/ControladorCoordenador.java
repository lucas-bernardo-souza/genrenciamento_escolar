package controlador;

import classes.Aluno;
import classes.Coordenador;
import classes.PlanoPedagogico;
import classes.Professor;

public class ControladorCoordenador {
	private Coordenador coordenador;
	
	public ControladorCoordenador(Coordenador coordenador) {
		this.coordenador = coordenador;
	}
	
	public Aluno cadastrarAluno(String nome, String cpf, String registroEscolar) {
		return coordenador.criaAluno(nome, cpf, registroEscolar);
	}
	
	public Professor cadastrarProfessor(String nome, String cpf, String area, String titulacao) {
		return coordenador.criaProfessor(nome, cpf, area, titulacao);
	}
	
	public void cadastrarDisciplina(String nome, Professor professor, PlanoPedagogico planoPedagogico) {
		coordenador.criaDisciplina(nome, professor, planoPedagogico);
	}
	
	public void cadastrarPlanoPedagogico(int cargahoraria) {
		coordenador.criaPlanoPedagogico(cargahoraria);
	}
	
	public void removeAluno(String cpf) {
		coordenador.removeAluno(cpf);
	}
	
	public void removeProfessor(String cpf) {
		coordenador.removeProfessor(cpf);
	}
	
}
