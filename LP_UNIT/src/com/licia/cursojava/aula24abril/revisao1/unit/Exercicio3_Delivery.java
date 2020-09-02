package com.licia.cursojava.aula24abril.revisao1.unit;


import java.util.Scanner;

public class Exercicio3_Delivery {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int qtdePrato1, qtdePrato2;
		float contaTotal;
		final float TAXA_ENTREGA = 7.0f;
		final float VALOR_PRATO1 = 10.0f;
		final float VALOR_PRATO2 = 13.0f;
		
		System.out.println("Digite a quantidade de pratos do TIPO1:");
		qtdePrato1 = scan.nextInt();
		
		System.out.println("Digite a quantidade de pratos do TIPO2:");
		qtdePrato2 = scan.nextInt();
		
		contaTotal = (qtdePrato1 * VALOR_PRATO1) + (qtdePrato2 * VALOR_PRATO2) + TAXA_ENTREGA ;
		
		System.out.printf("A conta do clinete é de %.3f", contaTotal);
	

	}

}
