package com.licia.cursojava.mentorialogicadeprogramacao.unit;

import java.util.Scanner;

public class Exercício_DoWhile {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		final float VALOR_DIARIO = 500f;
		float debito, sobra;
		String continuar = "S";
		
		sobra = VALOR_DIARIO;
		
		do {
			System.out.print("Digite o valor do débito: ");
			debito = scan.nextFloat();
			
			sobra = sobra - debito;
			
			if(sobra < 0) {
				System.out.println("Não pode realizar o débito. Fundo de caixa insuficiente.");
				sobra = sobra + debito;
				continue;
			}
			System.out.printf("O saldo para o fundo de caixa é de %.2f \n", sobra);
			System.out.print("Deseja continuar (S/N)? ");
			continuar = scan.next();
			
			if(continuar.equalsIgnoreCase("N")) {
				System.out.println("Sessão encerrada.");
				break;
			}
			
		} while(sobra >= 0);
		scan.close();		
	}
}
