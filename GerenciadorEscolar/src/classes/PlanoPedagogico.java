package classes;

import java.util.ArrayList;

public class PlanoPedagogico {
	private ArrayList<String> conteudos;
	private ArrayList<String> referenciasBibliografica;
	private int cargaHoraria;
	
	public PlanoPedagogico(int cargaHoraria) {
		conteudos = new ArrayList<String>();
		referenciasBibliografica = new ArrayList<String>();
		this.cargaHoraria = cargaHoraria;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}


	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}


	public ArrayList<String> getConteudos() {
		return conteudos;
	}

	public ArrayList<String> getReferenciasBibliografica() {
		return referenciasBibliografica;
	}

	public void addConteudo(String conteudo) {
		conteudos.add(conteudo);
		return;
	}
	
	public void addReferenciaBibliografica(String referenciaBibliografica) {
		referenciasBibliografica.add(referenciaBibliografica);
		return;
	}
	
}
