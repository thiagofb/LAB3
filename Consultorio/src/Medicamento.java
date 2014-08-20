
public class Medicamento {

	private String nomeMedic;
	private String dosagem;
	private int cod;
	

	public Medicamento(String nomeMedic, String dosagem ,int cod)
	{
		this.nomeMedic = nomeMedic;
		this.dosagem = dosagem;
		this.cod = cod;
		
	}


	public String getNomeMedic() {
		return nomeMedic;
	}


	public void setNomeMedic(String nomeMedic) {
		this.nomeMedic = nomeMedic;
	}


	public String getDosagem() {
		return dosagem;
	}


	public void setDosagem(String dosagem) {
		this.dosagem = dosagem;
	}


	public int getCod() {
		return cod;
	}


	public void setCod(int cod) {
		this.cod = cod;
	}
	
	
	
	
}
