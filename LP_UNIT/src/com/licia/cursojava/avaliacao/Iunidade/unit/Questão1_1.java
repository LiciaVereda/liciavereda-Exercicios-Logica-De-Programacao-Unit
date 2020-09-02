package com.licia.cursojava.avaliacao.Iunidade.unit;

import java.util.Scanner;

public class Questão1_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final  float PEDAGIO_MENSAL = 300f;
		final float PERCENTUAL_DIA_UTIL = 0.6667f;
		int diaUtil, diaNaoUtil;
		float valorPedagioUtil, valorPedagioNaoUtil;
		
		System.out.print("Digite o número de dias úteis no mês corrente: ");
		diaUtil = scan.nextInt();
		
		System.out.print("Digite o número de dias não úteis no mês corrente: ");
		diaNaoUtil = scan.nextInt();
		
		 valorPedagioNaoUtil = PEDAGIO_MENSAL / ((diaUtil* PERCENTUAL_DIA_UTIL) + diaNaoUtil);
		 valorPedagioUtil = valorPedagioNaoUtil * PERCENTUAL_DIA_UTIL;
		
		
		System.out.printf("O valor do pedágio em dias úteis %.2f\n",valorPedagioUtil);
		System.out.printf("O valor do pedágio em dias não úteis %.2f",valorPedagioNaoUtil);
		scan.close();
	}

}
