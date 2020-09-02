package com.licia.cursojava.aula01abril.estruturarepeticao.unit;

import java.util.Scanner;

public class NumerosParesDecrescente {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero;
		String conjuntoPares = " ";
		
	
		System.out.print("Digite um número: ");
		numero = scan.nextInt();
	
		
		for(int i=numero; i>=0; i--) {
			
			if(i % 2 == 0) {
				conjuntoPares+= +i;	
			}
		}
		System.out.printf("Os números pares no intervalo digitado é %s: ", conjuntoPares);
		scan.close();

	}

}
