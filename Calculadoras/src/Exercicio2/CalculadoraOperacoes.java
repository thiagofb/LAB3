package Exercicio2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CalculadoraOperacoes extends JFrame implements ActionListener {

	private JLabel label1,label2, labelResultado;
	private JTextField text1, text2, textResultado;
	private JButton botaoCalcular, botaoZerar;
	private JRadioButton soma, subtracao, multiplicacao, divisao;
	int resposta;
	
	
	
	public CalculadoraOperacoes ()
	{
		super("Calculadora com opções de operações matematicas");
		setBounds(100,100,400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		inicializaComponestes();		
		setVisible(true);
	}


	private void inicializaComponestes() 
	{
		
		this.setLayout(new BorderLayout());
		
		// criando os paineis
		JPanel painelPrincipal = new JPanel(new GridLayout(5,1));
		JPanel painel1 =         new JPanel(new FlowLayout());
		JPanel painel2 =         new JPanel(new FlowLayout());
		JPanel painelRadio =     new JPanel(new FlowLayout());
		JPanel painelResultado = new JPanel(new FlowLayout());
		JPanel painelBotao =     new JPanel(new FlowLayout());

		
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
		
		// JRadioButton 4 opçoes
		soma = new JRadioButton("Soma");
		painelRadio.add(soma);
		soma.addActionListener(this); //add evento de somar
		
		subtracao = new JRadioButton("Subtração");
		painelRadio.add(subtracao);
		subtracao.addActionListener(this); //add evento de subtraçao
		
		multiplicacao = new JRadioButton("Multiplicação");
		painelRadio.add(multiplicacao);
		multiplicacao.addActionListener(this); //add evento de multiplicacao

		divisao = new JRadioButton("divisao");
		painelRadio.add(divisao);
		divisao.addActionListener(this); //add evento de divisao
		
		painelPrincipal.add(painelRadio); // joga os radio dentro da painel principal
		
		// painel para resultado	
		
		labelResultado = new JLabel("Resultado: ");
		painelResultado.add(labelResultado);
		textResultado = new JTextField(10);
		painelResultado.add(textResultado);
		
		painelPrincipal.add(painelResultado);
		
		// criando botao{
		
		botaoCalcular = new JButton("Calcular");
		painelBotao.add(botaoCalcular);
		botaoZerar = new JButton("Zerar");
		painelBotao.add(botaoZerar);		
		painelPrincipal.add(painelBotao, BorderLayout.SOUTH);
		
		botaoCalcular.addActionListener(this);
		botaoZerar.addActionListener(this);
		
		// add os paineis no FRAME
		this.add(painelPrincipal);
	}
	
	
	// realizando os comando dos botoes ACOES
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == botaoCalcular && soma.isSelected())
		{// SOMA
			int n1 = Integer.parseInt(text1.getText());
			int n2 = Integer.parseInt(text2.getText());
			int total =  n1 + n2;
			textResultado.setText(Integer.toString(total));			
		}			
		if(e.getSource() == botaoCalcular && subtracao.isSelected())
		{// SUBTRAÇAO
			int n1 = Integer.parseInt(text1.getText());
			int n2 = Integer.parseInt(text2.getText());
			int total = n1 - n2;
			textResultado.setText(Integer.toString(total));
		}
		if(e.getSource() == botaoCalcular && multiplicacao.isSelected())
		{// MULTIPLICAÇAO
			int n1 = Integer.parseInt(text1.getText());
			int n2 = Integer.parseInt(text2.getText());
			int total = n1 * n2;
			textResultado.setText(Integer.toString(total));
		}
		if(e.getSource() == botaoCalcular && divisao.isSelected())
		{// DIVISAO
			int n1 = Integer.parseInt(text1.getText());
			int n2 = Integer.parseInt(text2.getText());
			int total = n1 / n2;
			textResultado.setText(Integer.toString(total));
		}
		if(e.getSource() == botaoZerar)
		{
			text1.setText("");
			text2.setText("");
			textResultado.setText("");
			soma.setSelected(false);
			subtracao.setSelected(false);
			multiplicacao.setSelected(false);
			divisao.setSelected(false);
		}
		
	}
	
	
}
