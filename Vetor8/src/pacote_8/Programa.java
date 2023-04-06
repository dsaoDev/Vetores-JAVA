package pacote_8;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("QUANTOS ALUNOS SERAO DIGITADOS?: ");
		int n = sc.nextInt();
		
		String [] nomeAlunos = new String [n];
		double [] primeiraNotaAluno = new double [n];
		double [] segundaNotaAluno = new double [n];
		String [] mostrar = new String [n];
		
		for (int i=0; i<mostrar.length; i++) {
			sc.nextLine();
			System.out.print("Digite nome, primeira e segunda nota do "+ (i+1) + "o aluno: ");
			nomeAlunos[i] = sc.nextLine();
			primeiraNotaAluno[i] = sc.nextDouble();
			segundaNotaAluno[i] = sc.nextDouble();
		}
	  double media;
	  System.out.println("ALUNOS APROVADOS : ");
		for(int i =0; i<mostrar.length; i++) {
			media = (primeiraNotaAluno[i] + segundaNotaAluno[i]) /2;
			if(media >= 6) {
				System.out.printf("%s%n",nomeAlunos[i]);
			}
		}
		

		
		
		sc.close();

	}

}
