package com.licia.cursojava.listaexercicio2.unit;

import java.util.Scanner;

public class Exercicio06_Parcela {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float valorParcela, valorJuros,valorTotalPagamento;
		int diaVencimento, diaPagamento, diaAtraso, index;
		final float multaAtraso = 1.50f;
		
		System.out.println("Entre com o valor da parcela:");
		valorParcela = scan.nextFloat();
		System.out.println("Entre com o dia de vencimento: ");
		diaVencimento = scan.nextInt();
		System.out.println("Entre com o dia do pagamento");
		diaPagamento = scan.nextInt();
		
		diaAtraso = diaPagamento - diaVencimento;
		
		if(diaAtraso == 0 || diaAtraso <0) {
			index=0;
		}
		else {
			index= diaAtraso;
		}
		
		valorJuros = index * multaAtraso;
		valorTotalPagamento =  valorParcela + valorJuros;
		
		System.out.printf("Os dias em atraso da parcela foi: %d.\n",index);
		System.out.printf("O valor do juros sobre a parcela será de: %.2f..\n",valorJuros);
		System.out.printf("O valor total do pagamento será de: %.2f..", valorTotalPagamento);
		scan.close();

	}

}
