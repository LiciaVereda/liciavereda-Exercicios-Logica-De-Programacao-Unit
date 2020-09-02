package com.licia.cursojava.listaexercicio2.unit;

import java.util.Scanner;

public class Exercicio08_Parcela03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float valorParcela, valorJuros=0,valorDesconto=0, valorTotalPagamento,index;
		int diaPagamento, diaAtraso, indexDia;
		final float multaAtraso = 0.004f;
		final float descontoAntecipado = 0.05f;
		final int diaVencimento = 5;
		
		System.out.println("Entre com o valor da parcela:");
		valorParcela = scan.nextFloat();
		
		System.out.println("Entre com o dia do pagamento");
		diaPagamento = scan.nextInt();
		
		diaAtraso = diaPagamento - diaVencimento;
		
		if(diaAtraso == 0 || diaAtraso <0) {
			indexDia = 0;
			valorDesconto = (descontoAntecipado * valorParcela);
			index =  valorDesconto * (-1);
			
		}
		else {
			indexDia = diaAtraso;
			valorJuros = diaAtraso * multaAtraso;
			index = valorJuros;
		}
		
		valorTotalPagamento =  valorParcela + index;
		
		System.out.printf("Os dias em atraso da parcela foi: %d.\n",indexDia);
		System.out.printf("O valor do juros sobre a parcela será de: %.2f..\n",valorJuros);
		System.out.printf("O valor do desconto sobre a parcela será de: %.2f..\n",valorDesconto);
		System.out.printf("O valor total do pagamento será de: %.2f..", valorTotalPagamento);
		scan.close();

	}

}
