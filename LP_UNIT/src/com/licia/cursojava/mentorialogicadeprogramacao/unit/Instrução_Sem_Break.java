package com.licia.cursojava.mentorialogicadeprogramacao.unit;

import java.util.Scanner;

public class Instru��o_Sem_Break {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numeroProcurado;
		
		System.out.print("Digite um n�mero: ");
		numeroProcurado = scan.nextInt();
		
		for (int i = 0; i <= 5; i++) {
			
			if(numeroProcurado == i) {
				System.out.println("O n�mero digitado foi: " +i);	
			} else {
				System.out.println("O n�mero digitado n�o �:" +i);
			}			
		}
		System.out.print("FIM DA EXECU��O");
		scan.close();
	}
}




