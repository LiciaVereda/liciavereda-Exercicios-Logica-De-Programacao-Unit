package com.licia.cursojava.mentorialogicadeprogramacao.unit;

import java.util.Scanner;

public class Banco_DoWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int operacao;
		boolean erro;
		
		do {
			System.out.println("Digite 1 - VER SALDO / 2- SACAR : ");
			operacao = scan.nextInt();
			
			if(operacao==1 || operacao == 2) {
				System.out.print("OPERA��O V�LIDA\n");
				erro = false;
				
			}
			else {
				System.out.print("OPERA��O INV�LIDA\n");
				erro =true;
			}
		}
		while(erro);
		
		System.out.print("FIM DA EXECU��O");
		scan.close();
	}

}




