package com.licia.cursojava.mentorialogicadeprogramacao.unit;

import java.util.Scanner;

public class Instrução_Sem_Break {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numeroProcurado;
		
		System.out.print("Digite um número: ");
		numeroProcurado = scan.nextInt();
		
		for (int i = 0; i <= 5; i++) {
			
			if(numeroProcurado == i) {
				System.out.println("O número digitado foi: " +i);	
			} else {
				System.out.println("O número digitado não é:" +i);
			}			
		}
		System.out.print("FIM DA EXECUÇÃO");
		scan.close();
	}
}




