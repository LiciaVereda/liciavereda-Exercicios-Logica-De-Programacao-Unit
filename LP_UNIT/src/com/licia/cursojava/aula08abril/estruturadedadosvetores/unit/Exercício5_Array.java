package com.licia.cursojava.aula08abril.estruturadedadosvetores.unit;

import java.util.Scanner;

public class Exercício5_Array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String [] cidades = new String[5];
		int [] qtdePessoas = new int[5];
		boolean[] maiores = new boolean[5];
		int totalContaminadas=0;
		float media=0;
		final int numeroCidades= 3;
		
		for (int i = 0; i < qtdePessoas.length; i++) {
			System.out.printf("Entre com o número de pessoas contaminadas da %dº cidade ", i+1);
			qtdePessoas[i] = scan.nextInt();
			totalContaminadas+=qtdePessoas[i];
		}
				
		for (int i = 0; i < cidades.length; i++) {
			System.out.printf("Entre com o nome da cidade contaminada : ", i+1);
			cidades[i] = scan.next();		
		}
		
		media =(float) totalContaminadas / numeroCidades;
		
		for (int i = 0; i < qtdePessoas.length; i++) {
			if (qtdePessoas[i]>=media) {
				maiores[i]=true;		
			}
		}
		System.out.println("\nCidade que tiveram o número de pessoas contaminadas acima da média: ");
		for (int i = 0; i < maiores.length; i++) {
			if(maiores[i]==true) {
				System.out.printf("\nCidade: %s , pessoas contaminadas: %s \n", cidades[i], qtdePessoas[i]);
			}
		}
		scan.close();

	}

}
