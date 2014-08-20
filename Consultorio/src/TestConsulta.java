import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class TestConsulta  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		//RegistroConsulta reg = new RegistroConsulta();
		//Paciente p = new Paciente();
		 ArrayList<Paciente> paciente = new ArrayList<Paciente>();
		 ArrayList<AgendamentoConsulta> agendamentoConsulta = new ArrayList<AgendamentoConsulta>();
		 int operacao=0;
		
		do{  
            System.out.println("-------------------------");  
            System.out.println("MENU PRINCIPAL");  
            System.out.println("-------------------------");  
            System.out.println("1 - CADASTRAR PACIENTE");  
            System.out.println("2 - AGENDAR PACIENTE");  
            System.out.println("3 - REGISTRO DE CONSULTAS");
            System.out.println("4 - HISTORICO");
            System.out.println("5 - SAIR");
        	operacao = t.nextInt();
		
            switch (operacao) {
			case 1:
				
			
				Paciente p1 = new Paciente();
				p1.criaPaciente();
				/*
				String n = JOptionPane.showInputDialog(null, "DIgite seu nome");
				p1.setNome(n);
				String d = JOptionPane.showInputDialog(null, "DIgite sua data de nasc");
				p1.setDataNasc(d);
				String c = JOptionPane.showInputDialog(null, "DIgite seu cpf");
				p1.setCpf(c);
				*/
				paciente.add(p1);
				
				
				break;
			case 2:
				AgendamentoConsulta ag = new AgendamentoConsulta();
				ag.agendarConsulta();
				//String p2 = JOptionPane.showInputDialog(null,"Digite as info do paciente: ");				
				agendamentoConsulta.add(ag);
				break;
			case 3:
	
				break;
			case 4:
	
				break;
			case 5:
	
				break;
		
		
			default:
				break;
           }
           
           
		}while (operacao!=5);
		
	}
}
