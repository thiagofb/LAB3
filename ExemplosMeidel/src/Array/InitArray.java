package Array;

public class InitArray {

	
	public static void main(String[] args) {

		final int ARRAY_LENGHT = 10;// declara constante
		
		int[] array;//declara array nao identificado
		array = new int[ARRAY_LENGHT];// cria objeto do array
		
		
		//calcula o valor de cada elemento do array
		for(int counter=0; counter < array.length; counter++)
			array[counter] = 2+ 2* counter;
		
		System.out.printf("%s%8s\n", "Index", "Value");// titulos da coluna

		
		//gera saida do valor de cada elemento do array
		for(int counter =0; counter < array.length; counter++)
			System.out.printf("%5d%8d\n", counter,array[counter]);
		
	}//fim do main

}// fim da class initaray
