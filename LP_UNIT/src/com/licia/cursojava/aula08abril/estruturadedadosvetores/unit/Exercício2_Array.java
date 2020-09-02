package com.licia.cursojava.aula08abril.estruturadedadosvetores.unit;

import java.util.Scanner;

public class Exercício2_Array {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int [] qtdePessoa = new int [5];
		int total = 0, contadorCidades=0, somaCidades=0;
		final int numeroCidades = 5;
		float media=0;
			
		for(int i=0; i<qtdePessoa.length; i++) {
				
			System.out.printf("Digite a quantidade de pessoas contaminadas na %dº cidade do estado: ", i+1);
			qtdePessoa[i] = scan.nextInt();
			total+=qtdePessoa[i];
		 }
				
		 media = (float) total / numeroCidades;
			
		 for(int i=0; i<qtdePessoa.length; i++) {
			if(qtdePessoa[i]>=media){
				contadorCidades++;	
				somaCidades+=qtdePessoa[i];
				}
		 }
				
							
		  System.out.printf("\nA média de pessoas contaminadas  por corona vírus foram de: %.2f \n", media);
		  System.out.printf("O número de cidades que tiveram pessoas contaminadas acima da média foram de: %d\n", contadorCidades);
		  System.out.printf("A soma de pessoas contaminadas das cidades que ficaram acima da média foi de: %d ", somaCidades);
		  scan.close();
   }

}


