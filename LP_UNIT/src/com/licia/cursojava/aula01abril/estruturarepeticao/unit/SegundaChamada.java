package com.licia.cursojava.aula01abril.estruturarepeticao.unit;

import java.util.Scanner;

public class SegundaChamada {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		int qtdeAlunos=0;
		double media, nota, acumuladorNota=0;
		
		try{
		System.out.print("Digite o n�mero de alunos que far�o segunda chamada: ");
		qtdeAlunos = scan.nextInt();
		if(qtdeAlunos<0) {
			System.out.println("N�o � permitido n�mero de alunos negativos");
		}
		}
		catch(Throwable exc) {
			System.out.println("N�o � prmitido n�meros negativos");
		}
		
		
		
		if(qtdeAlunos==0) {
			System.out.println("N�o temos m�dia a ser calculada");
		}
		
		for(int i=0; i<=qtdeAlunos; i++) {
			
			System.out.printf("Digite a nota do %d� aluno: ", i+1);
			nota = scan.nextDouble();
			
			if(nota<0) {
				System.out.println("Digite uma nota positiva");
				continue;
			}
			
			else {
				acumuladorNota+=nota;
			}
			
			
			acumuladorNota+=nota;
				
		}
		media = acumuladorNota / qtdeAlunos;
		
		System.out.printf("A m�dia dos alunos que fizeram segunda chamada � de %.2f", media);
		scan.close();
			
		}

}
