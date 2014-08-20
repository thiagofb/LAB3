import javax.swing.JOptionPane;


public class Paciente {

	private String nome;
	private String dataNasc;
	private String cpf;
	private String prontuario;
	
	
	public String getProntuario() {
		return prontuario;
	}

	public void setProntuario(String prontuario) {
		this.prontuario = prontuario;
	}

	public Paciente(String nome, String dataNasc, String cpf, String prontuario)
	{
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.cpf = cpf;
		this.prontuario = prontuario;
	}

    public Paciente() {
		// TODO Auto-generated constructor stub
	}

	
	public String mostra()
    {
    	return nome;
		
    }
    
    
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDataNasc() {
		return dataNasc;
	}


	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void criaPaciente(){
	
	String n = JOptionPane.showInputDialog(null, "DIgite seu nome");
	setNome(n);
	String d = JOptionPane.showInputDialog(null, "DIgite sua data de nasc");
	setDataNasc(d);
	String c = JOptionPane.showInputDialog(null, "DIgite seu cpf");
	setCpf(c);
	}
	
	
}
