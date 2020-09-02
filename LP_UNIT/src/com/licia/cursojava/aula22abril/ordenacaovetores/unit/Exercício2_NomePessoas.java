package com.licia.cursojava.aula22abril.ordenacaovetores.unit;

import java.util.Scanner;

public class Exercício2_NomePessoas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String [] nome = { "Licia","Anna"," Paula", "Thiago"," Carlos"};
		int menorNome;
		
		for (int i = 0; i < nome.length-1; i++) {
			menorNome = i;

			for (int j = i+1 ; j < nome.length; j++) {
				
				if (nome[j].compareTo(nome[menorNome])<0) {
					menorNome = j;					
				}
			}
			
			String temp = nome[i];
			nome[i] = nome[menorNome];
			nome[menorNome] = temp;
		}
		
		System.out.println("O array em ordem crescente é:");
		for (int i = 0; i < nome.length; i++) {
			
			System.out.printf("\n[%d] = %s", i, nome[i]);
			
		}
		scan.close();
		

	}

}
