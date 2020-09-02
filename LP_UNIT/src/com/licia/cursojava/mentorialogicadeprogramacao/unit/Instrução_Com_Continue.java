package com.licia.cursojava.mentorialogicadeprogramacao.unit;

import java.util.Scanner;

public class Instrução_Com_Continue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numeroProcurado;
		
		
		System.out.print("Digite um número: ");
		numeroProcurado = scan.nextInt();
		
		for (int i = 1; i <= 3; i++) {
			
			if(numeroProcurado == i) {
				System.out.println("O número digitado foi: " +i);	
			} else {
				System.out.println("O número digitado não é:" +i);
				continue;
			}	
			System.out.println("XXXXXXXXXXX");
		}
		scan.close();
		
	}
}


