package Exercicio1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculadoraSimples extends JFrame {
	
	
	private JLabel label1,label2;
	private JTextField text1, text2;
	private JButton botao;
	int totalSoma;

	
	public CalculadoraSimples()
	{
		super("Calculadora Simples");
		setBounds(100,100,300,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		inicializaComponestes();		
		setVisible(true);
	}


	private void inicializaComponestes() {
		
		this.setLayout(new BorderLayout());
		
		// criando os paineis
		JPanel painelPrincipal = new JPanel(new FlowLayout());
		JPanel painel1 = new JPanel(new FlowLayout());
		JPanel painel2 = new JPanel(new FlowLayout());
		
		// painel 1
		label1 = new JLabel("Digite o 1º numero: ");
		text1  = new JTextField(10);
		painel1.add(label1);
		painel1.add(text1);
		painelPrincipal.add(painel1);
	
		// painel 2
		label2 = new JLabel("Digite o 2º numero: ");
		text2  = new JTextField(10);
		painel2.add(label2);
		painel2.add(text2);
		painelPrincipal.add(painel2);
		
		 // add os paineis no FRAME
		this.add(painelPrincipal);

		
		
	}
}
