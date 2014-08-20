package teste;

import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args) {
		
		int a = JOptionPane.showConfirmDialog(null, "confirma?");
		System.out.println(a);
		if(a==0){
		String n = JOptionPane.showInputDialog(null, "DIgite seu nome");
		
		JOptionPane.showMessageDialog(null, "Hello "+ n);
		}
		
	}
}
