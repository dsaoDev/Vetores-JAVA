package pacote2;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("qnts numeros vc vai digitar? : ");
		int n = sc.nextInt();
		
		int [] vetorNumeros = new int [n];
		
		for(int i = 0; i<vetorNumeros.length; i++) {
			System.out.println("Digite um número: ");
			vetorNumeros[i] = sc.nextInt();
		}
		System.out.print("NUMEROS PARES:  ");
		
		int contadorDePares = 0;
		for(int i =0; i<vetorNumeros.length; i++) {
			if (vetorNumeros [i] % 2 == 0) {
				contadorDePares ++;
				System.out.printf("%d ",vetorNumeros[i]);
			}
		}
		System.out.println();
		System.out.print("QUANTIDADE DE PARES: " +  contadorDePares);
		
		
		
		
		
		
		
		sc.close();

	}

}
