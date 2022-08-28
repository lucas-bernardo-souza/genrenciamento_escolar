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
	
	public Professor criaProfessor(String nome, String cpf, String area, String titulacao) {
		Professor prof = new Professor(nome, cpf, area, titulacao);
		System.out.println("Entrou no metodo criar professor");
		return prof;
	}
	
	public Aluno criaAluno(String nome, String cpf, String registroEscolar) {
		Aluno al = new Aluno(nome, cpf, registroEscolar);
		System.out.println("Entrou no metodo criar aluno na classe coordenador!");
		return al;
	}
	
	public void criaPlanoPedagogico(int cargaHoraria) {
		System.out.println("Entrou no metodo criar plano pedagogico na classe coordenador");
		return;
	}
	
	public Disciplina criaDisciplina(String nome, Professor professor, PlanoPedagogico planoPedagogico) {
		System.out.println("Entrou no metodo criar disciplina na classe coordenador");
		Disciplina disc = new Disciplina(nome, professor, planoPedagogico);
		return disc;
	}
	
	public Aluno removeAluno(String cpf) {
		System.out.println("Entrou no metodo remover aluno na classe coordenador");
		return null;
	}

	
	public Professor removeProfessor(String cpf) {
		System.out.println("Entrou no metodo remover professor na classe coordenador");
		return null;
	}
}
