package com.licia.cursojava.aula01abril.estruturarepeticao.unit;

import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero;
		String conjuntoPares =" ";
		
		System.out.println("Digite um número");
		numero = scan.nextInt();
		
		for(int i=numero; i<numero;i--) {
			
			if(i % 2 == 0) {
				
				conjuntoPares+= +i;				
			}
				
		}
		System.out.printf("os numeros são %s: ", conjuntoPares);
		scan.close();

	}

}
