package com.licia.cursojava.aula01abril.estruturarepeticao.unit;

import java.util.Scanner;

public class Exerc�cio03_SegundaChamada {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		int qtdeAlunos=0, contador=1;
		double media, nota, acumuladorNota=0;
		
		
		System.out.print("Digite o n�mero de alunos que far�o segunda chamada: ");
		qtdeAlunos = scan.nextInt();
		

		if(qtdeAlunos==0) {
			System.out.println("N�o temos m�dia a ser calculada");
		}
		else {
			while(contador<=qtdeAlunos) {
				System.out.printf("Digite a nota do %d� aluno", contador);
				nota = scan.nextDouble();
				
				if(nota<0) {
					System.out.println("Digite uma nota positiva");
					continue;
				}
				
				acumuladorNota+=nota;
				contador++;		
			}
			
		}
			
		media = acumuladorNota / qtdeAlunos;
		
		System.out.printf("A m�dia dos alunos que fizeram segunda chamada � de %.2f", media);
		scan.close();	
	}

}
