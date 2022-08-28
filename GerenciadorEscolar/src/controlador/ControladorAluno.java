package controlador;

import classes.Aluno;
import classes.Disciplina;

public class ControladorAluno {
	private Aluno aluno;
	
	public ControladorAluno(Aluno aluno) {
        this.aluno = aluno;
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
