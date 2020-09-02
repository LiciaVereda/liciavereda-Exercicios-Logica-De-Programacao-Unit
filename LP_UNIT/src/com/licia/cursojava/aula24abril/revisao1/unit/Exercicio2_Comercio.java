package com.licia.cursojava.aula24abril.revisao1.unit;

import java.util.Scanner;


public class Exercicio2_Comercio {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		float apuradoDia, fundoCaixa;
		int depositoBanco1, depositoBanco2, depositoBanco3;
		final int QUANTIDADE_BANCO = 3;
		
		System.out.println("Digite o valor apurado em um dia de funcionamento: ");
		apuradoDia = scan.nextFloat();
		
		depositoBanco1 = (int) apuradoDia / QUANTIDADE_BANCO;
		depositoBanco2 = (int) apuradoDia / QUANTIDADE_BANCO;
		depositoBanco3 = (int) apuradoDia / QUANTIDADE_BANCO;
		
		fundoCaixa = apuradoDia -(float)( depositoBanco1 + depositoBanco2 + depositoBanco3);
		
		System.out.printf("O valor a ser depositado no BANCO1 é de %d\n", depositoBanco1);
		System.out.printf("O valor a ser depositado no BANCO2 é de %d\n", depositoBanco2);
		System.out.printf("O valor a ser depositado no BANCO2 é de %d\n", depositoBanco2);
		System.out.printf("O valor para o FUNDO DE CAIXA é de %.2f", fundoCaixa);
		
	}
}
