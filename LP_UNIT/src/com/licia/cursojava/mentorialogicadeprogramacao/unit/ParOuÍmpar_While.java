package com.licia.cursojava.mentorialogicadeprogramacao.unit;

import java.util.Scanner;

public class ParOuÍmpar_While {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int numero;
		
		System.out.print("Informe um número qualquer: ");
		numero = scan.nextInt();
		
		while(numero!=-1) {
			if(numero % 2 ==0) {
				System.out.println("O número informado é par");
			}
			else {
				System.out.println("O número informado é ímpar");
			}
			System.out.print("Informe um novo número: ");
			numero = scan.nextInt();
						
		}
		System.out.println("FIM DA EXECUÇÃO");
		scan.close();
	}
}
