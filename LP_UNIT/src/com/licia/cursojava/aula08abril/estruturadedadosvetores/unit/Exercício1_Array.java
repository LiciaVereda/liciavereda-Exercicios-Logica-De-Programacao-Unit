package com.licia.cursojava.aula08abril.estruturadedadosvetores.unit;

import java.util.Scanner;

public class Exerc�cio1_Array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] qtdePessoa = new int [5];
		int total = 0;
		final int numeroCidades = 5;
		float media=0;
		
		for(int i=0; i<qtdePessoa.length; i++) {
			
			System.out.printf("Digite a quantidade de pessoas contaminadas na %d� cidade do estado: ", i+1);
			qtdePessoa[i] = scan.nextInt();
			total+=qtdePessoa[i];
		}
		
		media = total / numeroCidades;
		System.out.printf("A mpedia de pessoas contaminadas  por corona v�rus foi de: %.2f \n", media);
		
		System.out.println("O n�mero de pessoas contaminadas por cidade foi: ");
		for(int i =0; i<qtdePessoa.length; i++) {
			System.out.printf("%d� cidade: %d\n", i+1, qtdePessoa[i]);
		}
		scan.close();
		
		

	}

}
