import java.util.Scanner;

import javax.swing.JOptionPane;


@SuppressWarnings("unused")
public class RegistroConsulta {

		Paciente paciente;
		String prontu�rio;
		String receitu�rio;
				
		
	
	public void iniciaConsulta(Paciente p)
	{
		paciente.criaPaciente();
		String prontuario = JOptionPane.showInputDialog(null, "DIgite prontuario do paciente");
		setProntu�rio(prontuario);
		String receituario = JOptionPane.showInputDialog(null, "DIgite receituario");
		setReceitu�rio(receituario);
		
	}
	
	public String getProntu�rio() {
		return prontu�rio;
	}

	public void setProntu�rio(String prontu�rio) {
		this.prontu�rio = prontu�rio;
	}

	public String getReceitu�rio() {
		return receitu�rio;
	}

	public void setReceitu�rio(String receitu�rio) {
		this.receitu�rio = receitu�rio;
	}

	public void receituarioPaciente(Paciente p,Medicamento m)
	{
		String n = JOptionPane.showInputDialog(null, "DIgite o prontuario do Paciente");
		p.setProntuario(n);
		
		
	}
	
	
	/*
	Paciente p1 = new Paciente("thiago", "null", "null", "null");
	Medicamento m1 = new Medicamento("aspirina", "null", 0);
	
	String n = JOptionPane.showInputDialog(null, "DIgite seu nome");
	JOptionPane.showMessageDialog(null, "Hello "+ n);
	

	
	
	Scanner t = new Scanner(System.in);
	
	System.out.println("Digite numero de consultas do dia");
    int qntConsulta = t.nextInt();
	
*/		
}
