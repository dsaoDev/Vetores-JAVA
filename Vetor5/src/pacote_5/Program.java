package pacote_5;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("qnts elemtnso o vetor vai ter?: ");
		int n = sc.nextInt();
		double [] vetor = new double [n];
		
		for(int i=0; i<vetor.length; i++) {
			System.out.println("digite um numero : ");
			vetor[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for(int i=0; i<vetor.length; i++) {
			soma = soma + vetor[i];
		}
		
		double media = soma / vetor.length;
		
		System.out.printf("MEDIA DO VETOR: %.3f%n",media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		
		for(int i=0; i<vetor.length; i++) {
			if(vetor[i] < media) {
				System.out.printf("%.1f%n",vetor[i]);
			}
		}
		
		
		
		
		
		sc.close();

	}

}
