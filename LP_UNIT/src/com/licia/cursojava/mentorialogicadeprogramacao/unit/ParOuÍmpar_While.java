package com.licia.cursojava.mentorialogicadeprogramacao.unit;

import java.util.Scanner;

public class ParOu�mpar_While {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int numero;
		
		System.out.print("Informe um n�mero qualquer: ");
		numero = scan.nextInt();
		
		while(numero!=-1) {
			if(numero % 2 ==0) {
				System.out.println("O n�mero informado � par");
			}
			else {
				System.out.println("O n�mero informado � �mpar");
			}
			System.out.print("Informe um novo n�mero: ");
			numero = scan.nextInt();
						
		}
		System.out.println("FIM DA EXECU��O");
		scan.close();
	}
}
