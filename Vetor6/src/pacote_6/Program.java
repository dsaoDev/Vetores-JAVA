package pacote_6;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("quantos elementos vai ter o vetor?");
	  int n = sc.nextInt();
	  
	  int [] vetor = new int [n];
	  
	  for(int i=0; i<vetor.length; i++) {
		  System.out.println("digite um numero: ");
		  vetor[i] = sc.nextInt();
	  }
	 
	  double soma = 0.0;
	  int qtdpares = 0;
	  for (int i=0; i<vetor.length; i++) {
		  if(vetor[i] % 2 == 0) {
			  qtdpares ++;
			  soma = soma + vetor[i];
			 
		  }
			  
		  
	  }
	  
	  double media = soma / qtdpares;
	  if(qtdpares == 0) {
		  System.out.println("NENHUM NÚMERO PAR");
	  }else {
		  System.out.printf("MEDIA DOS PARES: %.1f%n",media);
	  }
	  
	  
	  
	  
	  
	  sc.close();

	}

}
