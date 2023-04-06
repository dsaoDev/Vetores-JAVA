package pacote_9;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão digitadas: ");
		int n = sc.nextInt();
		
		double [] altura = new double[n];
		char [] sexo = new char [n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Altura da "+ (i+1) + "a pessoa");
			altura[i] = sc.nextDouble();
			System.out.println("genero da "+ (i+1) + "a pessoa");
			sexo[i] = sc.next().charAt(0);
		}
		
		double menorAltura = altura[0];
		double maiorAltura = 0;
		double soma = 0;
		double mediaAlturaMulher;
		int qtdmulher = 0;
		int qtdhomem = 0;
		
		for(int i=0; i<n; i++) {
			if(altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
				
		}
		
		for(int i=0; i<n; i++) {
			if(altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
		}
		
		for(int i=0; i<n; i++) {
			if(sexo[i] == 'F' || sexo[i] == 'f') {
				qtdmulher ++;
				soma = soma + altura[i];
			}else {
				qtdhomem ++;
			}
		}
	   
		mediaAlturaMulher = soma / qtdmulher;
		
		System.out.printf("MENOR ALTURA: %.2f%n",menorAltura);
		System.out.printf("MAIOR ALTURA: %.2f%n",maiorAltura);
		System.out.printf("Media das alturas das mulheres: %.2f%n",mediaAlturaMulher);
		System.out.println("Numero de Homens: " + qtdhomem);
		sc.close();

	}

}
