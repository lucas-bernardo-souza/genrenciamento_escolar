package interfaces;

import java.util.Scanner;

import classes.Aluno;
import classes.Coordenador;
import classes.Professor;
import controlador.Controlador;

public class Interface {
	private Controlador controladorCord;
	private Controlador controladorProf;
	private Controlador controladorAlu;
	
	public Interface(Coordenador c, Professor p, Aluno alu) {
		controladorCord = new Controlador(c);
		controladorProf = new Controlador(p);
		controladorAlu = new Controlador(alu);
	}
	
	public void menuCoordenador() {
		int opcao = 1;
		Scanner input = new Scanner(System.in);
		while(opcao != 0) {
			System.out.println();
			System.out.println("-------------Menu Coordenador-------------");
			System.out.println("1: Matricular aluno");
			System.out.println("2: Contratar professor");
			System.out.println("3: Adicionar novo plano pedagógico");
			System.out.println("4: Adicionar uma nova disciplina");
			System.out.println("5: Desvincular aluno da turma");
			System.out.println("6: Desvincular professor da turma");
			System.out.println("0: Voltar");
			System.out.println("------------------------------");
			System.out.println();
			System.out.println("Selecione uma opção do menu!");
			opcao = input.nextInt();
			switch(opcao) {
			case 1:
				controladorCord.cadastrarAluno(null, null, null);
				break;
			case 2:
				controladorCord.cadastrarProfessor(null, null, null, null);
				break;
			case 3:
				controladorCord.cadastrarPlanoPedagogico(0);
				break;
			case 4:
				controladorCord.cadastrarDisciplina(null, null, null);
				break;
			case 5:
				controladorCord.removerAluno(null);
				break;
			case 6:
				controladorCord.removerProfessor(null);
				break;
			}
		}
		
	}
	
	public void menuProfessor() {
		int opcao = 1;
		Scanner input = new Scanner(System.in);
		while(opcao != 0) {
			System.out.println();
			System.out.println("-------------Menu Professor-------------");
			System.out.println("1: Registrar aula");
			System.out.println("2: Criar uma atividade para a turma");
			System.out.println("3: Registrar presença em aula");
			System.out.println("4: Fazer comentário para turma");
			System.out.println("5: Fazer comentário para um aluno");
			System.out.println("6: Visualizar dados da Disiplina");
			System.out.println("0: Voltar");
			System.out.println("------------------------------");
			System.out.println();
			System.out.println("Selecione uma opção do menu!");
			opcao = input.nextInt();
			switch(opcao) {
			case 1:
				controladorProf.registrarAula(null, null, null);
				break;
			case 2:
				controladorProf.criarAtivida(null, null, null);
				break;
			case 3:
				controladorProf.criarListaDePresença(null);
				break;
			case 4:
				controladorProf.fazerComentarioPublico(null, null);
				break;
			case 5:
				controladorProf.comentarioPrivado(null, null, null, null);
				break;
			case 6:
				controladorProf.consultaDisciplina(null);
				break;
			}
		}
	}
	
	public void menuAluno() {
		int opcao = 1;
		Scanner input = new Scanner(System.in);
		while(opcao != 0) {
			System.out.println();
			System.out.println("-------------Menu Aluno-------------");
			System.out.println("1: Se inscrever em disciplina");
			System.out.println("2: Entregar atividade");
			System.out.println("3: Visualizar disciplinas");
			System.out.println("0: Voltar");
			System.out.println("------------------------------");
			System.out.println();
			System.out.println("Selecione uma opção do menu!");
			opcao = input.nextInt();
			switch(opcao) {
			case 1:
				controladorAlu.inscreverEmDisciplina(null);
				break;
			case 2:
				controladorAlu.concluirAtividade();
				break;
			case 3:
				controladorAlu.consultarDisciplinasMatriculadas();
				break;
			}
		}
	}
}

