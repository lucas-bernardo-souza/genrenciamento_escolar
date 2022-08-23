package interfaces;

import classes.Aluno;
import classes.Coordenador;
import classes.Professor;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coordenador c = new Coordenador("Wilson Ramos", "000.000.000-00");
		Professor p = new Professor("João Aparecido", "111.111.111-11", "Humanas", "Mestre");
		Aluno alu = new Aluno("Lucas Santos", "222.222.222-22", "Registro Escolar");
		Interface menus = new Interface(c, p, alu);
		
		menus.menuCoordenador();
		menus.menuProfessor();
		menus.menuAluno();
	}

}
