package com.licia.cursojava.avaliacao.Iunidade.unit;

import java.util.Scanner;


public class Questao1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		final  float PEDAGIO_MENSAL = 300f;
		final float PERCENTUAL_DIA_UTIL = 0.6667f;
		final float PERCENTUAL_DIA_NAO_UTIL = 0.333f;
		int diaUtil, diaNaoUtil;
		float valorPedagioUtil, valorPedagioNaoUtil, valorDiaUtil, valorDiaNaoUtil;
		
		valorDiaUtil= PERCENTUAL_DIA_UTIL * PEDAGIO_MENSAL;
		valorDiaNaoUtil = PERCENTUAL_DIA_NAO_UTIL * PEDAGIO_MENSAL;
		
		System.out.print("Digite o número de dias úteis no mês corrente: ");
		diaUtil = scan.nextInt();
		
		System.out.print("Digite o número de dias não úteis no mês corrente: ");
		diaNaoUtil = scan.nextInt();
		
		valorPedagioUtil = valorDiaUtil / diaUtil;
		valorPedagioNaoUtil = valorDiaNaoUtil / diaNaoUtil;
		
		System.out.printf("O valor do pedágio em dias úteis %.2f\n",valorPedagioUtil);
		System.out.printf("O valor do pedágio em dias não úteis %.2f",valorPedagioNaoUtil);
		scan.close();
				

	}

}
