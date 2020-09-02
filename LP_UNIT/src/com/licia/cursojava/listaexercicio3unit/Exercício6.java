package com.licia.cursojava.listaexercicio3unit;

import java.util.Scanner;

public class Exercício6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int idade, contador, maisIdosa=0;
		String nome, nomeIdosa = " ";
		
		for(contador=0; contador<4;contador++) {
			System.out.printf("Digite o nome da %d° pessoa",contador+1);
			nome = scan.next();
			
			System.out.printf("Digite a idade da %d° pessoa", contador +1);
			idade = scan.nextInt();
			
			if(idade>maisIdosa) {
				maisIdosa = idade;
				nomeIdosa = nome;
			}			
		}
		System.out.printf("O nome da pessoa mais idosa é %s.\n", nomeIdosa);
		System.out.printf("A idade da pessoa mais idosa é %d anos.",maisIdosa);
		scan.close();
	}

}
