package classes;

import java.util.ArrayList;
import java.util.Date;

public class Disciplina {
	private String nome;
	private Professor professor;
	private PlanoPedagogico planoPedagogico;
	private ArrayList<Aluno> alunosMatriculados;
	private ArrayList<Aula> aulas;
	private ArrayList<String> comentariosPublicos;
	private ArrayList<String> comentariosParticulares;
	
	public Disciplina(String nome, Professor professor, PlanoPedagogico planoPedagogico) {
		this.nome = nome;
		this.professor = professor;
		this.planoPedagogico = planoPedagogico;
		alunosMatriculados = new ArrayList<Aluno>();
		aulas = new ArrayList<Aula>();
		comentariosPublicos = new ArrayList<String>();
		comentariosParticulares = new ArrayList<String>();
	}

	public String nome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setprofessorDaDisciplina(Professor professor) {
		this.professor = professor;
	}

	public PlanoPedagogico getPlanoPedagogico() {
		return planoPedagogico;
	}

	public void setPlanoPedagogico(PlanoPedagogico planoPedagogico) {
		this.planoPedagogico = planoPedagogico;
	}

	public void addAula(Aula aula) {
		aulas.add(aula);
		return;
	}
	
	public ArrayList<Aula> getAulas(){
		return aulas;
	}

	public String getNome() {
		return nome;
	}

	public ArrayList<Aluno> getAlunosMatriculados() {
		return alunosMatriculados;
	}

	public ArrayList<String> getComentariosPublicos() {
		return comentariosPublicos;
	}

	public ArrayList<String> getComentariosParticulares() {
		return comentariosParticulares;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public Atividade consultaAtividade(Date dataAtribuicao) {
		// Busca nas aulas as atividades disponiveis
		System.out.println("Entrou no metodo busca de atividade");
		return null;
	}
	
	public ArrayList<Float> consultarNotas(Date dataAtribuicao){
		System.out.println("Entrou no metodo de consultar notas");
		return null;
	}
	
	public int consultarFaltas(){
		// Retorna a porcentagem de faltas da turma
		System.out.println("Entrou no metodo consultar faltas");
		return 0;
	}
	
	public ArrayList<Aluno> consultarTurma(){
		System.out.println("Entrou no metodo consultar turma");
		return alunosMatriculados;
	}
	
	public void registrarAula(Aula aula) {
		aulas.add(aula);
		System.out.println("Entrou no metodo registrar aula");
		return;
	}
}
