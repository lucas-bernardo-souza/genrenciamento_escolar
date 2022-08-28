package controlador;

import java.util.ArrayList;

import classes.Aluno;
import classes.Disciplina;

public class ControladorAluno {
	private Aluno aluno;
	private ArrayList<Aluno> alunos;
	
	public ControladorAluno() {
        alunos = new ArrayList<Aluno>();
    }
	
	public void addAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public void inscreverEmDisciplina(Disciplina disc, String cpf) {
		for(int i = 0; i < alunos.size(); i++) {
			if(alunos.get(i).getCpf() == cpf) {
				aluno = alunos.get(i);
			}
		}
		aluno.matricularEmDisciplina(disc);
	}
	
	public void concluirAtividade(String cpf) {
		for(int i = 0; i < alunos.size(); i++) {
			if(alunos.get(i).getCpf() == cpf) {
				aluno = alunos.get(i);
			}
		}
		aluno.concluirAtividade();
	}
	
	public void consultarDisciplinasMatriculadas(String cpf){
		for(int i = 0; i < alunos.size(); i++) {
			if(alunos.get(i).getCpf() == cpf) {
				aluno = alunos.get(i);
			}
		}
		aluno.getDisciplinasMatriculadas();
	}
	
	public void consultarAtividades(String cpf) {
		for(int i = 0; i < alunos.size(); i++) {
			if(alunos.get(i).getCpf() == cpf) {
				aluno = alunos.get(i);
			}
		}
        aluno.consultarAtividade();
    }
	
	public void consultarNotas(String cpf) {
		for(int i = 0; i < alunos.size(); i++) {
			if(alunos.get(i).getCpf() == cpf) {
				aluno = alunos.get(i);
			}
		}
        aluno.consultarNota();
    }
	
	public void consultarFaltas(String cpf) {
		for(int i = 0; i < alunos.size(); i++) {
			if(alunos.get(i).getCpf() == cpf) {
				aluno = alunos.get(i);
			}
		}
        aluno.consultarFalta();
    }
}
