package com.licia.cursojava.aula01abril.estruturarepeticao.unit;

import java.util.Scanner;

public class Exerc�cio05_ComecoNome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome, letra;
		int contadorVogal=0, contadorConsoante=0;
		
		for(int i=0;i<3;i++) {
			System.out.printf("Digite o %d� nome", i+1);
			nome = scan.next();
			letra = nome.substring(0, 1);
			
			
			if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") ||
					letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")  ) {
				contadorVogal++;					
			}
			else {
				contadorConsoante++;
			}
		}
		
		System.out.printf("O n�mero de nomes que come�am com vogal foi: %d\n", contadorVogal);
		System.out.printf("O n�mero de nomes que come�am com consoante foi: %d", contadorConsoante);
		scan.close();
		
	}

}
