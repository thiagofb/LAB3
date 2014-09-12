package Exercicio1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculadoraSimples extends JFrame implements ActionListener {
	
	
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
		JPanel painelBotao = new JPanel(new FlowLayout());
		
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
		
		

		// criando botao
		botao = new JButton("Somar");
		painelBotao.add(botao);
		painelPrincipal.add(painelBotao, BorderLayout.SOUTH);
		
		// add os paineis no FRAME
		this.add(painelPrincipal);
		
		// cria o evento(acão) para somar
		botao.addActionListener(this);
		
		
	}
	// metodo para o botao somar
	@Override
	public void actionPerformed(ActionEvent e)
	{
		int n1,n2;
		n1 = Integer.parseInt(text1.getText());
		n2 = Integer.parseInt(text2.getText());
		totalSoma = n1 + n2;
		
		JOptionPane.showMessageDialog(null, totalSoma);
		
	}
	
	
	
	
	
	
}
