package com.licia.cursojava.aula01abril.estruturarepeticao.unit;

import java.util.Scanner;

public class NumerosParesDecrescente {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero;
		String conjuntoPares = " ";
		
	
		System.out.print("Digite um n�mero: ");
		numero = scan.nextInt();
	
		
		for(int i=numero; i>=0; i--) {
			
			if(i % 2 == 0) {
				conjuntoPares+= +i;	
			}
		}
		System.out.printf("Os n�meros pares no intervalo digitado � %s: ", conjuntoPares);
		scan.close();

	}

}
