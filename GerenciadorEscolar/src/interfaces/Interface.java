package interfaces;

import java.util.ArrayList;
import java.util.Scanner;

import classes.Coordenador;
import classes.Disciplina;
import controlador.Controlador;

public class Interface {
	//private Controlador controladorCord;
	//private Controlador controladorProf;
	//private Controlador controladorAlu;
        private final Controlador controlador;

	public Interface(Coordenador c) {
		//controladorCord = new Controlador(c);
		//controladorProf = new Controlador(p);
		//controladorAlu = new Controlador(alu);
          controlador = new Controlador(c);
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
				//controladorCord.cadastrarAluno(null, null, null);
                controlador.cadastrarAluno("João Victor Santos", "111.111.111-11", "Registro-1");
				break;
			case 2:
				controlador.cadastrarProfessor("Wilson Romano", "222.222.222-22", "Biologicas", "Bacharelado");
				break;
			case 3:
				controlador.cadastrarPlanoPedagogico(0);
				break;
			case 4:
				controlador.cadastrarDisciplina("Biologia", "222.222.222-22", null);
				controlador.cadastrarDisciplina("Matemática", "222.222.222-22", null);
				controlador.cadastrarDisciplina("Física", "222.222.222-22", null);
				break;
			case 5:
				controlador.removeAluno(null);
				break;
			case 6:
				controlador.removeProfessor(null);
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
			System.out.println("6: Consultar alunos da Disiplina");
			System.out.println("0: Voltar");
			System.out.println("------------------------------");
			System.out.println();
			System.out.println("Selecione uma opção do menu!");
			opcao = input.nextInt();
			switch(opcao) {
			case 1:
				controlador.registrarAula(null, null, null, null, "Biologia");
				controlador.registrarAula(null, null, null, null, "Matemática");
				controlador.registrarAula(null, null, null, null, "Física");
				break;
			case 2:
				controlador.criarAtivida(null, null, null, null, null, null);
				break;
			case 3:
				controlador.criarListaDePresenca(null, null);
				break;
			case 4:
				controlador.fazerComentarioPublico(null, null, null);
				break;
			case 5:
				controlador.comentarioPrivado(null, null, null, null, null);
				break;
			case 6:
				controlador.consultaDisciplina(null, null);
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
			System.out.println("1: Entregar atividade");
			System.out.println("2: Consultar disciplinas matriculadas");
			System.out.println("3: Consultar atividade");
			System.out.println("4: Consultar notas");
			System.out.println("5: Consultar faltas");
			System.out.println("6: Se inscrever em disciplina");
			System.out.println("0: Voltar");
			System.out.println("------------------------------");
			System.out.println();
			System.out.println("Selecione uma opção do menu!");
			opcao = input.nextInt();
			switch(opcao) {
			
			case 1:
				controlador.concluirAtividade("111.111.111-11");
				break;
			case 2:
				controlador.consultarDisciplinasMatriculadas("111.111.111-11");
				break;
            case 3:
            	controlador.consultarAtividades("111.111.111-11");
                break;
            case 4:
            	controlador.consultarNotas("111.111.111-11");
                break;
            case 5:
            	controlador.consultarFaltas("111.111.111-11");
                break;
            case 6:
            	
				break;
			}
		}
	}
        
        
        public void entrarEmDisciplinaAluno() {
		int opcao = 1;
		Scanner input = new Scanner(System.in);
		while(opcao != 0) {
			System.out.println();
			System.out.println("-------------Aluno - Escolher disciplina matriculada-------------");
			System.out.println("1: Se inscrever em disciplina");
			System.out.println("2: Visualizar disciplinas");
			System.out.println("0: Voltar");
			System.out.println("------------------------------");
			System.out.println();
			System.out.println("Selecione uma opção do menu!");
			opcao = input.nextInt();
			switch(opcao) {
			case 1:
				controlador.inscreverEmDisciplina("Biologia", "111.111.111-11", "222.222.222-22");
				controlador.inscreverEmDisciplina("Matemática", "111.111.111-11", "222.222.222-22");
				controlador.inscreverEmDisciplina("Física", "111.111.111-11", "222.222.222-22");
				break;
			case 2:
				ArrayList<Disciplina> disciplinas;
				int op = 1, j = 1;
				disciplinas = controlador.consultarDisciplinasMatriculadas("111.111.111-11");
				System.out.println("Selecione uma disciplina:");
				for(int i = 0; i < disciplinas.size(); i++) {
					System.out.println(j + ": " + disciplinas.get(i).getNome());
					j++;
				}
				System.out.println("0: Voltar");
				op = input.nextInt();
				this.menuAluno();
			}
		}
        }
        
        public void entrarEmDisciplinaProfessor() {
		int opcao = 1;
		Scanner input = new Scanner(System.in);
		while(opcao != 0) {
			System.out.println();
			System.out.println("-------------Professor - Escolher disciplina ministrada-------------");
			System.out.println("1: Física");
			System.out.println("2: Química");
			System.out.println("3: Matemática");
			System.out.println("0: Voltar");
			System.out.println("------------------------------");
			System.out.println();
			System.out.println("Selecione uma opção do menu!");
			opcao = input.nextInt();
			switch(opcao) {
			case 1:
				this.menuProfessor();
				break;
			case 2:
				this.menuProfessor();
				break;
			case 3:
				this.menuProfessor();
				break;
			}
		}
        } 
        
        public void login() {
		int opcao = 1;
		Scanner input = new Scanner(System.in);
		while(opcao != 0) {
			System.out.println();
			System.out.println("-------------Você deseja logar como:-------------");
			System.out.println("1: Coordenador");
			System.out.println("2: Professor");
			System.out.println("3: Aluno");
			System.out.println("0: Voltar");
			System.out.println("------------------------------");
			System.out.println();
			System.out.println("Selecione uma opção do menu!");
			opcao = input.nextInt();
			switch(opcao) {
			case 1:
				this.menuCoordenador();
				break;
			case 2:
				this.entrarEmDisciplinaProfessor();
				break;
			case 3:
				this.entrarEmDisciplinaAluno();
				break;
			}
		}
        } 
}

