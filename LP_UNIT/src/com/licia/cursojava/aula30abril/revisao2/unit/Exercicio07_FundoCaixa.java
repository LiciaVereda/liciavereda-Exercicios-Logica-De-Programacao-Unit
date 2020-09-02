package com.licia.cursojava.aula30abril.revisao2.unit;

import java.util.Scanner;

public class Exercicio07_FundoCaixa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final float FUNDO_CAIXA = 500.00f;
		float saldoFundoCaixa=FUNDO_CAIXA, despesaDiaria;
		boolean saldoNovasDespesas = false;
		
		
		do {
			System.out.println("Digite o valor da despesa diária");
			despesaDiaria = scan.nextFloat();
			
			if(saldoFundoCaixa>despesaDiaria) {
				saldoFundoCaixa-= despesaDiaria;
				saldoNovasDespesas=true;
			}
			else {
				saldoFundoCaixa= saldoFundoCaixa;
				break;
			}
		
		}
		while(saldoNovasDespesas);
		
		System.out.printf("O saldo do fundo de caixa é %.2f:", saldoFundoCaixa);
		scan.close();

	}

}
