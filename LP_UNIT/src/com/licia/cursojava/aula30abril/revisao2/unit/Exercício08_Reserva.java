package com.licia.cursojava.aula30abril.revisao2.unit;

import java.util.Scanner;

public class Exercício08_Reserva {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numeroVeiculos=0, numeroPessoasVeiculo,numeroPessoasReserva=0, contador=1, testeNumeroPessoasReserva=0;
		float valorTotalEstacionamentoVeiculo=0, valorTotalEntradaPessoa=0, totalApurado=0;
		final float TAXA_PESSOA=30f;
		final float TAXA_VEICULO = 30f;
		
		
		while(contador<=5) {
			System.out.printf("Digite quantas pessoas têm no %dº veículo: ",contador);
			numeroPessoasVeiculo =  scan.nextInt();
			
			if (numeroPessoasVeiculo<1 && numeroPessoasVeiculo>7) {
				System.out.println("Quatidade de pessoas não aceita");
				continue;			
			}
			
			testeNumeroPessoasReserva+=numeroPessoasVeiculo;
			
			if(testeNumeroPessoasReserva<=20 && numeroVeiculos<=5) {
				numeroPessoasReserva+=numeroPessoasVeiculo;
				valorTotalEstacionamentoVeiculo+=TAXA_VEICULO;
				valorTotalEntradaPessoa += TAXA_PESSOA * numeroPessoasVeiculo;
				numeroVeiculos++;
			}
			else {
				System.out.println("\nCAPACIDADE ATINGIDA\n");
				break;
			}		
			contador++;
		}
		
		totalApurado = valorTotalEntradaPessoa + valorTotalEstacionamentoVeiculo;
		
		System.out.printf("O valor número de pessoas na reserva é de %d:\n",numeroPessoasReserva);
		System.out.printf("O valor número de veículos na reserva é de %d:\n",numeroVeiculos);
		System.out.printf("O valor apurado com as visitas foi de %.2f: ", totalApurado);
		scan.close();

	}

}
