package com.licia.cursojava.aula24abril.revisao1.unit;

import java.util.Scanner;

/*6.  Escreva um enunciado no estilo Problema e Requisito para o seguinte contexto de uma residência que precisa 
identificar a média de consumo diário com energia e água. Elabore o programa para resolver o problema de 
acordo com os requisitos especificados. 

Problema : Uma companhia elética cobra por cada KW/h consumido, R$0,75.É cobrado uma taxa para iluminação pública de R$9,57.
 Uma compahia de distribuição de água potável cobra R$30.00 se o consumo mensal for de até 10 metros cúbicos, a partir desse valor é cobrado 
 uma taxa de R$5,00 por metro cubico consumido.  * 
 
 Uma residência tem um consumo mensal de energia e água. Elabore um programa para mostrar o consumo diário de água e energia dessa residência.
 Considerar um mês com 30 dias.
 Requisitos : Mostar a média de consumo diário de energia e água dessa residência.
 * 
 * 
 * 
 * */




public class Exercicio6_ConsumoEnergia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int consumoEnergia, consumoAgua;
		float mediaDiariaAgua, mediaDiariaEnergia;
		final int DIAS_MES = 30;
		
		
		System.out.print("Entre com o consumo mensal de água da residência em metros cúbicos: ");
		consumoAgua = scan.nextInt();
		
		System.out.print("Entre com o consumo mensal de energia da residência: ");
		consumoEnergia = scan.nextInt();
		
		
		mediaDiariaAgua = (float) consumoAgua / DIAS_MES;
		mediaDiariaEnergia = (float) consumoEnergia / DIAS_MES;
		
		System.out.printf("A média diária de consumo de água é de %.2f/dia\n", mediaDiariaAgua);
		System.out.printf("A média diária de consumo de energia é de %.2f Kwh/dia", mediaDiariaEnergia);
	

	}

}
