package com.licia.cursojava.aula24abril.revisao1.unit;

import java.util.Scanner;

/*6.  Escreva um enunciado no estilo Problema e Requisito para o seguinte contexto de uma resid�ncia que precisa 
identificar a m�dia de consumo di�rio com energia e �gua. Elabore o programa para resolver o problema de 
acordo com os requisitos especificados. 

Problema : Uma companhia el�tica cobra por cada KW/h consumido, R$0,75.� cobrado uma taxa para ilumina��o p�blica de R$9,57.
 Uma compahia de distribui��o de �gua pot�vel cobra R$30.00 se o consumo mensal for de at� 10 metros c�bicos, a partir desse valor � cobrado 
 uma taxa de R$5,00 por metro cubico consumido.  * 
 
 Uma resid�ncia tem um consumo mensal de energia e �gua. Elabore um programa para mostrar o consumo di�rio de �gua e energia dessa resid�ncia.
 Considerar um m�s com 30 dias.
 Requisitos : Mostar a m�dia de consumo di�rio de energia e �gua dessa resid�ncia.
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
		
		
		System.out.print("Entre com o consumo mensal de �gua da resid�ncia em metros c�bicos: ");
		consumoAgua = scan.nextInt();
		
		System.out.print("Entre com o consumo mensal de energia da resid�ncia: ");
		consumoEnergia = scan.nextInt();
		
		
		mediaDiariaAgua = (float) consumoAgua / DIAS_MES;
		mediaDiariaEnergia = (float) consumoEnergia / DIAS_MES;
		
		System.out.printf("A m�dia di�ria de consumo de �gua � de %.2f/dia\n", mediaDiariaAgua);
		System.out.printf("A m�dia di�ria de consumo de energia � de %.2f Kwh/dia", mediaDiariaEnergia);
	

	}

}
