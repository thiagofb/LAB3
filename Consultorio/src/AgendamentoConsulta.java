import javax.swing.JOptionPane;


public class AgendamentoConsulta {
	
	Paciente paciente = new Paciente();
	String data;
	String especialidade;

	public AgendamentoConsulta(Paciente paciente, String data, String especialidade) {
		super();
		this.paciente = paciente;
		this.data = data;
		this.especialidade = especialidade;
	}
	
	public AgendamentoConsulta() {
		// TODO Auto-generated constructor stub
	}

	public void agendarConsulta(/*Paciente paciente, String data, String especialidade*/)
	{
		paciente.criaPaciente();
		String d = JOptionPane.showInputDialog(null, "DIgite a data");
		setData(d);
		String e = JOptionPane.showInputDialog(null, "DIgite a Especialidade");
		setData(e);
		
		/*
		this.paciente = paciente;		
		this.data = data;
		this.especialidade = especialidade;
		*/
		
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	
	
	
}
