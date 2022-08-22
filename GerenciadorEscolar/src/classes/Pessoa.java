package classes;

import java.util.Date;

public abstract class Pessoa {
	protected String nome;
	protected String cpf;
	protected Date dataNascimento;
	
	public Pessoa(String nome, String cpf, Date dataNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}
	
	public abstract Date getDataNascimento();
	
	public abstract void setDataNascimento(Date dataNascimento);

	public abstract String getNome();

	public abstract void setNome(String nome);

	public abstract String getCpf();

	public abstract void setCpf(String cpf);
}
