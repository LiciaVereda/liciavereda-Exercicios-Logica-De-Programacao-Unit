package com.licia.cursojava.mentorialogicadeprogramacao.unit;

import java.util.Scanner;

public class Exerc�cio3_FOR {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int placaVeiculo;
		float valorCarro, totalIPVA = 0;
		final float PERCENTUAL_IPVA = 0.1f;
		
		for(int i = 1; i <= 4; i++) {
			System.out.print("Digite o n�mero final da placa: ");
			placaVeiculo = scan.nextInt();
			
			System.out.print("Digite o valor do carro: ");
			valorCarro = scan.nextFloat();
			
			if(placaVeiculo >= 1 && placaVeiculo <= 3) {
				System.out.println("M�S PAGAMENTO DO IPVA: JANEIRO\n");
			}
			else if( placaVeiculo >= 4 && placaVeiculo <=6) {
				System.out.println("M�S PAGAMENTO DO IPVA: FEVEREIRO\n");
			}
			else if (placaVeiculo >= 7 && placaVeiculo<=9) {
				System.out.println("M�S PAGAMENTO DO IPVA: MAR�O\n");
			}
			else{
				System.out.println("M�S PAGAMENTO DO IPVA: ABRIL\n");
			}
			totalIPVA += valorCarro * PERCENTUAL_IPVA;
					
		}
			System.out.printf("O valor total arrecadado � de:R$ %.2f.", totalIPVA);
			scan.close();
	}

}
