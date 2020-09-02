package com.licia.cursojava.mentorialogicadeprogramacao.unit;

import java.util.Scanner;

public class Exerc�cio_DoWhile {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		final float VALOR_DIARIO = 500f;
		float debito, sobra;
		String continuar = "S";
		
		sobra = VALOR_DIARIO;
		
		do {
			System.out.print("Digite o valor do d�bito: ");
			debito = scan.nextFloat();
			
			sobra = sobra - debito;
			
			if(sobra < 0) {
				System.out.println("N�o pode realizar o d�bito. Fundo de caixa insuficiente.");
				sobra = sobra + debito;
				continue;
			}
			System.out.printf("O saldo para o fundo de caixa � de %.2f \n", sobra);
			System.out.print("Deseja continuar (S/N)? ");
			continuar = scan.next();
			
			if(continuar.equalsIgnoreCase("N")) {
				System.out.println("Sess�o encerrada.");
				break;
			}
			
		} while(sobra >= 0);
		scan.close();		
	}
}
