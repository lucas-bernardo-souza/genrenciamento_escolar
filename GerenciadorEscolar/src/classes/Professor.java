package classes;

import java.util.ArrayList;
import java.util.Date;

public class Professor {
	private String nome;
	private String cpf;
	private String area;
	private ArrayList<Disciplina> disciplinasMinistradas;
	private String titulacao;
	
	public Professor(String nome, String cpf, String area, String titulacao) {
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

	public void addDisciplina(Disciplina disciplina) {
		disciplinasMinistradas.add(disciplina);
	}
	
	public void registrarAula(Date data, String assuntoDaAula, String descricao, String nomeDisciplina) {
		System.out.println("Entrou no metodo registrar aula da classe professor!");
		// Adiciona a aula na disciplina
		return;
	}
	
	public void criarAtivida(Date dataAtribuicao, Date dataEntrega, String descricao, String nomeDisciplina, String assuntoAula) {
		System.out.println("Entrou no metodo criar atividade da classe professor");
		// Adiciona a atividade na aula
		return;
	}
	
	public void criarListaDePresenca(ArrayList<Aluno> alunos) {
		System.out.println("Entrou no metodo lista de presenca da classe professor");
		return;
	}
	
	public void fazerComentarioPublico(String comentario, String nomeDisciplina) {
		System.out.println("Entrou no metodo fazer comentario da classe professor");
		return;
	}
	
	public void consultarTurma() {
		System.out.println("Entrou no metodo consultar turma da classe professor");
		return;
	}
	
	public void comentarioPrivado(String nomeDisciplina, String deQuem, String paraQuem, String Mensagem) {
		System.out.println("Entrou no metodo comentario privado na classe professor");
		return;
	}
	
	public Disciplina consultaDisciplina(String nome) {
		for(int i = 0; i < disciplinasMinistradas.size(); i++) {
			if(disciplinasMinistradas.get(i).getNome() == nome) {
				return disciplinasMinistradas.get(i);
			}
		}
		return null;
	}
}
