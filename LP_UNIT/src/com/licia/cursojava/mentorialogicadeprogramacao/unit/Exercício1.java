package com.licia.cursojava.mentorialogicadeprogramacao.unit;

import java.util.Scanner;

public class Exerc�cio1 {

	public static void main(String[] args) {
		Scanner scan =  new Scanner (System.in);
		
		String nomeAluno, nomeResponsavel;
		int contadorMatriculaRejeitada = 0,qtdeAluno = 0, idadeAluno;
		float percentualMatriculaRejeitada;
		
		System.out.print("Digite o nome do aluno:");
		nomeAluno = scan.next();
		
		while(!nomeAluno.equalsIgnoreCase("XX")) {
			
			System.out.print("Digite a idade do aluno:");
			idadeAluno = scan.nextInt();
			
			if(idadeAluno >= 15 && idadeAluno < 21) {
				System.out.println("O aluno: S� PODER� SE MATRICULAR COM O RESPONS�VEL.\n");
				System.out.print("Digite o nome do respons�vel:");
				nomeResponsavel = scan.next();
			}
			else if(idadeAluno >= 21) {
				System.out.println("O aluno: PODER� SE MATRICULAR.\n");
				
			}
			else {
				System.out.println("O aluno: N�O PODE SE MATRICULAR.\n");
				contadorMatriculaRejeitada++;
			}
			
			qtdeAluno++;
			System.out.print("Digite o nome de um novo aluno:");
			nomeAluno = scan.next();			
		}		
		percentualMatriculaRejeitada = (float) contadorMatriculaRejeitada / qtdeAluno;
		System.out.printf("O percentual de matr�culas rejeitadas foi de: %.2f",percentualMatriculaRejeitada);
		scan.close();
	}

}
