import java.util.Scanner;

import javax.swing.JOptionPane;


@SuppressWarnings("unused")
public class RegistroConsulta {

		Paciente paciente;
		String prontuário;
		String receituário;
				
		
	
	public void iniciaConsulta(Paciente p)
	{
		paciente.criaPaciente();
		String prontuario = JOptionPane.showInputDialog(null, "DIgite prontuario do paciente");
		setProntuário(prontuario);
		String receituario = JOptionPane.showInputDialog(null, "DIgite receituario");
		setReceituário(receituario);
		
	}
	
	public String getProntuário() {
		return prontuário;
	}

	public void setProntuário(String prontuário) {
		this.prontuário = prontuário;
	}

	public String getReceituário() {
		return receituário;
	}

	public void setReceituário(String receituário) {
		this.receituário = receituário;
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
