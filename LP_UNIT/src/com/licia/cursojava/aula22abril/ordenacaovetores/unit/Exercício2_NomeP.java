package com.licia.cursojava.aula22abril.ordenacaovetores.unit;

import java.util.Scanner;

public class Exerc�cio2_NomeP {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String [] nome = { "Licia","Thiago","Anna", "Paula","Anna", "Thiago","Carlos", "Thiago"};
		int menorNome, contadorNomeDuplicado=0, num=1, num2=2;
		float media;
		String acumuladorNomes =" ", letra, acumuladorNomeDuplicado="";
	
		
		
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
		
		System.out.println("O array em ordem crescente �:");
		for (int i = 0; i < nome.length; i++) {
			
			System.out.printf("\n[%d] = %s", i, nome[i]);
			
		}
		
		
		
		for (int i = 0; i < nome.length; i++) {
			letra= nome[i].substring(0,1);
			
			if(letra.equalsIgnoreCase("A")|| letra.equalsIgnoreCase("E")|| letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O")|| letra.equalsIgnoreCase("U") ) {
				acumuladorNomes+= " "+ nome[i];
			}
			
		}
		System.out.printf("\nOs nomes que come�am com vogal s�o:%s", acumuladorNomes);
		
		for (int i = 0; i < nome.length; i++) {
			menorNome=i;
			for (int j = i+1; j < nome.length; j++) {
				if(nome[j].equalsIgnoreCase(nome[menorNome])) {
					
					acumuladorNomeDuplicado+= " " + nome[j];
					break;
					
					//contadorNomeDuplicado++;				
				}				
			}
			
		}
		
		
		System.out.printf("\nOs nomes duplicados foram %s\n:", acumuladorNomeDuplicado);
		System.out.printf("Os nomes duplicados foram %s:", contadorNomeDuplicado);
		
		
		scan.close();
		

	}

}
