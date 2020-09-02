package com.licia.cursojava.mentorialogicadeprogramacao.unit;

import java.util.Scanner;

public class Exercício1 {

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
				System.out.println("O aluno: SÓ PODERÁ SE MATRICULAR COM O RESPONSÁVEL.\n");
				System.out.print("Digite o nome do responsável:");
				nomeResponsavel = scan.next();
			}
			else if(idadeAluno >= 21) {
				System.out.println("O aluno: PODERÁ SE MATRICULAR.\n");
				
			}
			else {
				System.out.println("O aluno: NÃO PODE SE MATRICULAR.\n");
				contadorMatriculaRejeitada++;
			}
			
			qtdeAluno++;
			System.out.print("Digite o nome de um novo aluno:");
			nomeAluno = scan.next();			
		}		
		percentualMatriculaRejeitada = (float) contadorMatriculaRejeitada / qtdeAluno;
		System.out.printf("O percentual de matrículas rejeitadas foi de: %.2f",percentualMatriculaRejeitada);
		scan.close();
	}

}
