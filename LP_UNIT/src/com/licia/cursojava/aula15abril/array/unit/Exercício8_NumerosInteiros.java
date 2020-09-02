package com.licia.cursojava.aula15abril.array.unit;

import java.util.Scanner;

public class Exercício8_NumerosInteiros {

	public static void main(String[] args) {
		/*Considere um array carregado com 10 números inteiros positivos.

		•Informar se tem mais números pares, mais números impares ou iguais
		 */
		
		Scanner scan  =  new Scanner (System.in);
		
		int [] numerosInteiros = new int [6];
		int contadorPar=0, contadorImpar=0, contadorPositivo=0, contadorNegativo=0;
		
		
		for (int i = 0; i < numerosInteiros.length; i++) {
			System.out.printf("Digite o %dº número", i+1);
			numerosInteiros[i]= scan.nextInt();		
		}
		
		for (int i = 0; i < numerosInteiros.length; i++) {
			if(numerosInteiros[i] % 2 == 0) {
				contadorPar++;
			}
			else {
				contadorImpar++;
			}		
		}
		
		for (int i = 0; i < numerosInteiros.length; i++) {
			if(numerosInteiros[i]>0) {
				contadorPositivo++;
			}
			else {
				contadorNegativo++;
			}
			
		}
		
		
		if(contadorPar>contadorImpar) {
			System.out.printf("No conjunto de números informados temos mais números pares, na quantidade de %d\n:", contadorPar);
		}
		else if (contadorPar<contadorImpar){
			System.out.printf("No conjunto de números informados temos mais números ímpares, na quantidade de %d\n:", contadorImpar);
		}
		else {
			System.out.printf("No conjunto de números informados temos números ímpares e pares iguais\n");
				
		}
			
		
		if(contadorPositivo>contadorNegativo) {
			System.out.printf("No conjunto de números informados temos mais números positivos, na quantidade de %d:", contadorPositivo);		
		}
		else if(contadorPositivo<contadorNegativo) {
			System.out.printf("No conjunto de números informados temos mais números negativos, na quantidade de %d:", contadorNegativo);		
		}
		else {
			System.out.printf("No conjunto de números informados temos números iguais de positivos e negativos");
		}
		scan.close();
	}

}
