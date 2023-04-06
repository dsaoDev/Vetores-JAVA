package pacote_3;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("qnts numeros voce vai digitar: ");
		int n = sc.nextInt();
		
		double [] vetorNumeros = new double[n];
		for (int i=0; i<vetorNumeros.length; i++) {
			sc.nextLine();
			System.out.println("digite um numero: ");
			vetorNumeros[i] = sc.nextDouble();
		}
		
		double maiorvalor = 0;
		int posicaomaior = 0;
		
		for(int i=0; i<vetorNumeros.length; i++) {
			if(vetorNumeros[i] > maiorvalor) {
				maiorvalor = vetorNumeros[i];
				posicaomaior = i;
			}
		}
		
		System.out.printf("MAIOR VALOR = %.1f%n", maiorvalor);
		System.out.printf("POSICAO DO MAIOR VALOR = %d%n",posicaomaior);
		
		
		
		
		sc.close();

	}

}
