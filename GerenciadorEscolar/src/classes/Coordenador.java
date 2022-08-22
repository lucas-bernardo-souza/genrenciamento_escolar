package classes;


public class Coordenador {
	private String nome;
	private String cpf;
	
	public Coordenador(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
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
	
	public void criaProfessor(String nome, String cpf, String area, String titulacao) {
		System.out.println("Entrou no metodo criar professor");
		return;
	}
	
	public void criaAluno(String nome, String cpf, String registroEscolar) {
		System.out.println("Entrou no metodo criar aluno na classe coordenador!");
		return;
	}
	
	public void criaPlanoPedagogico(int cargaHoraria) {
		System.out.println("Entrou no metodo criar plano pedagogico na classe coordenador");
		return;
	}
	
	public void criaDisciplina(String nome, Professor professor, PlanoPedagogico planoPedagogico) {
		System.out.println("Entrou no metodo criar disciplina na classe coordenador");
		return;
	}

}
