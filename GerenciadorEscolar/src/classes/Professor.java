package classes;

import java.util.ArrayList;
import java.util.Date;

public class Professor {
	private String nome;
	private String cpf;
	private String area;
	private ArrayList<Disciplina> disciplinasMinistradas;
	protected String titulacao;
	
	public Professor(String nome, String cpf, String area, String titulacao, Date dataNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.area = area;
		this.titulacao = titulacao;
		disciplinasMinistradas = new ArrayList<Disciplina>();
	}
	
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
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

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	public ArrayList<Disciplina> getDisciplinasMinistradas() {
		return disciplinasMinistradas;
	}

	public void setDisciplinasMinistradas(ArrayList<Disciplina> disciplinasMinistradas) {
		this.disciplinasMinistradas = disciplinasMinistradas;
	}
	
	public Aula registrarAula(Date data, String assuntoDaAula, String descricao) {
		System.out.println("Entrou no metodo registrar aula da classe professor!");
		return null;
	}
	
	public Atividade criarAtivida(Date dataAtribuicao, Date dataEntrega, String descricao) {
		System.out.println("Entrou no metodo criar atividade da classe professor");
		return null;
	}
	
	public void criarListaDePresença(ArrayList<Aluno> alunos) {
		System.out.println("Entrou no metodo lista de presenca da classe professor");
		return;
	}
}
