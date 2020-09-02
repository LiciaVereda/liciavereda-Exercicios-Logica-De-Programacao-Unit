package com.licia.cursojava.aula01abril.estruturarepeticao.unit;

import java.util.Scanner;

public class Exercício04_Placa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String placa, letra;
		double valorVeiculo, valorIpvaMesJaneiro=0,valorIpvaMesFevereiro=0,valorIpvaMesMarco=0, valorIpvaMesAbril=0,valorIpvaTotal=0;
		int contadorCarros=1;
		final float percentualIpva = 0.1f;
		
		while(contadorCarros<=2) {
		
		System.out.printf("Digite a placa do %dº carro no padrão KKK-0000", contadorCarros);
		placa = scan.next();
		letra = placa.substring(7);
		
		System.out.println("Digite o valor corresponde a esse veículo:");
		valorVeiculo = scan.nextDouble();
		
		if(letra.equals("1") || letra.equals("2") || letra.equals("3") ) {
			System.out.println("O mês de pagamento do IPVA será JANEIRO");
			valorIpvaMesJaneiro+= percentualIpva * valorVeiculo;
		}
		else if(letra.equals("4") || letra.equals("5") || letra.equals("6")){
			System.out.println("O mês de pagamento do IPVA será FEVEREIRO");
			valorIpvaMesFevereiro+= percentualIpva * valorVeiculo;
			
		}
		else if (letra.equals("7") || letra.equals("8") || letra.equals("9")){
			System.out.println("O mês de pagamento do IPVA será MARÇO");
			valorIpvaMesMarco+= percentualIpva * valorVeiculo;
			
		}
		else {
			System.out.println("O mês de pagamento do IPVA será ABRIL");
			valorIpvaMesAbril+= percentualIpva * valorVeiculo;
		}
		
		contadorCarros++;
		
	}
		valorIpvaTotal = valorIpvaMesJaneiro + valorIpvaMesFevereiro + valorIpvaMesMarco + valorIpvaMesAbril;
		
		System.out.printf("O valor do IPVA arrecadado no mês de:\nJaneiro: %.2f \nFevereiro: %.2f \nMarço: %.2f \nAbril: %.2f \n",valorIpvaMesJaneiro, valorIpvaMesFevereiro,
				valorIpvaMesMarco, valorIpvaMesAbril);
		System.out.printf("O valor do IPVA total foi %.2f", valorIpvaTotal);
		scan.close();
}
}
