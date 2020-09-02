package com.licia.cursojava.aula15abril.array.unit;

import java.util.Scanner;

public class Exercício6_ArrayBuscaNome {

	public static void main(String[] args) {
		//Escreva um programa que armazene 6 nomes de pessoas em um array. Depois de armazenar os nomes, receba outro nome para procurar no array.
		//Informar, quantas vezes o nome procurado ocorre no array (Se o nome não for encontrado mostrar a mensagem “Nome não encontrado”.

		//VETOR:MARIA JOSE CARLOS MARIA ZELIA ANTONIO
		//POSIÇÃO I+1
		
		Scanner scan = new Scanner(System.in);
		
		
		String nome[]=new String[6];
		String nomeProcurar = " ";
		int contadorEncontrado=0;
		
		for (int i = 0; i < nome.length; i++) {
			System.out.printf("Digite o %sº nome",i+1);
			nome[i]= scan.next();
			
		}
		System.out.println("Digite o nome que deseja procurar");
		nomeProcurar = scan.next();
		
		for (int i = 0; i < nome.length; i++) {
			if(nome[i].equalsIgnoreCase(nomeProcurar)) {
				contadorEncontrado++;
			}		
		}
		if (contadorEncontrado>0) {
			System.out.printf("O nome aparece %d vezes no array", contadorEncontrado);	
		}
		else {
			System.out.println("Nome não encontrado");
		}
		scan.close();	

	}

}
