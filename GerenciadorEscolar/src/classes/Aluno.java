package classes;

import java.util.ArrayList;

public class Aluno {
	private String nome;
	private String cpf;
	private String registroEscolar;
	private ArrayList<Disciplina> disciplinasMatriculadas;
	
	public Aluno(String nome, String cpf, String registroEscolar) {
		this.nome = nome;
		this.cpf = cpf;
		this.registroEscolar = registroEscolar;
		disciplinasMatriculadas = new ArrayList<Disciplina>();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRegistroEscolar() {
		return registroEscolar;
	}

	public void setRegistroEscolar(String registroEscolar) {
		this.registroEscolar = registroEscolar;
	}
	
	public ArrayList<Disciplina> getDisciplinasMatriculadas(){
		System.out.println("Entrou no metodo get disciplinas (consultar disciplinas matriculadas) da classe aluno");
		return disciplinasMatriculadas;
	}
	
	public void matricularEmDisciplina(Disciplina disciplina) {
		disciplinasMatriculadas.add(disciplina);
		System.out.println("Entrou no método matricular Em Disciplina");
		return; //Fazer verificação caso ja esteja matriculado
	}
	
	public void concluirAtividade() {
		System.out.println("Entrou no método concluir atividade da classe aluno");
		return;
	}
	
        
	public void consultarAtividade() {
		System.out.println("Entrou no método consultar atividades da classe aluno");
		return;
	}
        
	public void consultarNota() {
		System.out.println("Entrou no método consultar notas da classe aluno");
		return;
	}

	public void consultarFalta() {
		System.out.println("Entrou no método consultar faltas da classe aluno");
		return;
	}
	
}
