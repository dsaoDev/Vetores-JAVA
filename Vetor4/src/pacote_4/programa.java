package pacote_4;

import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("quanmtos valores vai ter em cada vetor?: ");
		int n = sc.nextInt();
		
		int [] vetorA = new int[n];
	    int [] vetorB = new int [n];
	    int [] somaVetor = new int[n];
	    
	    for(int i=0; i<vetorA.length; i++) {
	    	System.out.println("Digite os valores do vetor A: ");
	    	vetorA[i] = sc.nextInt();
	    }
	    
	    
	    for(int i=0; i<vetorB.length; i++) {
	    	System.out.println("digite os valores do vetor B: ");
	    	vetorB[i] = sc.nextInt();
	    }
	    
	    int soma= 0;
	    System.out.println("VETOR RESULTANTE: ");
	    for(int i=0; i<somaVetor.length; i++) {
	    	soma = vetorA[i] + vetorB[i];
	    	System.out.println(soma);
	    }
		
		
		
		
		
		sc.close();

	}

}
