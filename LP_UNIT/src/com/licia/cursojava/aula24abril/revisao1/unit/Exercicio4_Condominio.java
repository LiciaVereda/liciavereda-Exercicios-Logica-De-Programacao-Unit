package com.licia.cursojava.aula24abril.revisao1.unit;

import java.util.Scanner;



public class Exercicio4_Condominio {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final float TAXA_SALARIO = 1.5f;
		
		
		float arrecadacaoCondominioNovembro, taxaCondominio, taxaFesta;
		int qtdeApartamentos;
		
		System.out.print("Digite o n�mero de apartamentos do condom�nio:");
		qtdeApartamentos = scan.nextInt();
		
		System.out.print("Digite a taxa mensal do condom�nio:");
		taxaCondominio = scan.nextFloat();
		
		System.out.print("Digite a taxa para a festa de fim de ano:");
		taxaFesta = scan.nextFloat();
		
		
		arrecadacaoCondominioNovembro = (qtdeApartamentos*taxaCondominio) + (qtdeApartamentos * taxaCondominio * TAXA_SALARIO) + (qtdeApartamentos*taxaFesta);
		
		
		System.out.printf("A previs�o de ARRECADA��O (M�S NOVEMBRO) %.2f:",arrecadacaoCondominioNovembro);


	}

}
