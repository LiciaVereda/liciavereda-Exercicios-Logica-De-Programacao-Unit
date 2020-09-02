package com.licia.cursojava.aula08abril.estruturadedadosvetores.unit;

import java.util.Scanner;

public class Exercício4_Array {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		String [] nome = new String [3];
		String nomeProcurar;
		boolean nomeEncontrado= false;
		
		for(int i=0; i<nome.length; i++) {
			System.out.printf("Digite o %dº nome", i+1);
			nome[i] = scan.next();
		}
		
		System.out.print("Digite o nome a ser procurado: ");
		nomeProcurar = scan.next();
		
		for (int i = 0; i < nome.length; i++) {
			if(nome[i].equalsIgnoreCase(nomeProcurar)) {
				//Posição é i+1
				System.out.printf("Nome encontrado na posição %d",i+1);
				nomeEncontrado = true;
				break;
			}		
		}
		
		if(nomeEncontrado == false) {
			System.out.println("Nome não encontrado");
		}
		scan.close();
	}

}
