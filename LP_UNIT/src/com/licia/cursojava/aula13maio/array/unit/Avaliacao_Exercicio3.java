package com.licia.cursojava.aula13maio.array.unit;

import java.util.Scanner;



public class Avaliacao_Exercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final float FREQUENCIA_MINIMA = 75f;
		String indicadorAprendizagemAv1, indicadorAprendizagemAv2, indicadorFinal;
		float frequenciaAluno;
		
		System.out.print("Digite o indicador de aprendizagem do aluno na 1º avaliação: ");
		indicadorAprendizagemAv1 = scan.next();
		
		System.out.print("Digite o indicador de aprendizagem do aluno na 2º avaliação: ");
		indicadorAprendizagemAv2 = scan.next();
		
		System.out.print("Digite a frequência do aluno: ");
		frequenciaAluno = scan.nextFloat();
		
		if((frequenciaAluno>= FREQUENCIA_MINIMA  && (indicadorAprendizagemAv1.equalsIgnoreCase("A") || indicadorAprendizagemAv1.equalsIgnoreCase("B")) &&
				(indicadorAprendizagemAv2.equalsIgnoreCase("A") || indicadorAprendizagemAv2.equalsIgnoreCase("B")))) {
			
			System.out.print("ALUNO: APROVADO");
		}
		
		else if(indicadorAprendizagemAv1.equalsIgnoreCase("C") && indicadorAprendizagemAv2.equalsIgnoreCase("C") || frequenciaAluno < 75) {
			System.out.print("ALUNO: REPROVADO");
		}
		else {
			
			System.out.println("ALUNO TEM DIREITO A FINAL");
			System.out.println("Digite o indicador do aluno na prova final: ");
			indicadorFinal = scan.next();
			if(indicadorFinal.equalsIgnoreCase("A") || indicadorFinal.equalsIgnoreCase("B") ) {
				System.out.print("ALUNO: APROVADO NA FINAL");
			}
			else {
				System.out.print("ALUNO: REPROVADO");
			}
			
		}				
				
		scan.close();	

}

}
