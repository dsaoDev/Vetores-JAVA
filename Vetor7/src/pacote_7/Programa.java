package pacote_7;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("QUANTAS PESSOAS VC VAI DIGITAR? ");
		int n = sc.nextInt();
		
		String [] vetorNomes = new String[n];
		int [] vetorIdades = new int [n];
		int [] vetorMostrar = new int [n];
		
		
		
		for(int i=0; i<vetorMostrar.length; i++) {
			sc.nextLine();
			System.out.println("Nome: ");
			vetorNomes[i] = sc.nextLine();
			System.out.println("Idade: ");
			vetorIdades[i] = sc.nextInt();
		}
		
		int maisvelho = 0;
		String nomemaisvelho = null;
		for(int i=0; i<vetorMostrar.length; i++) {
			System.out.println("Dados da "+ (i+1) + "a Pessoa");
			System.out.println(vetorNomes[i]);
			System.out.println(vetorIdades[i]);
			if(vetorIdades[i] > maisvelho) {
				nomemaisvelho = vetorNomes[i];
				maisvelho = vetorIdades[i];
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + nomemaisvelho);
		
		
		sc.close();

	}

}
