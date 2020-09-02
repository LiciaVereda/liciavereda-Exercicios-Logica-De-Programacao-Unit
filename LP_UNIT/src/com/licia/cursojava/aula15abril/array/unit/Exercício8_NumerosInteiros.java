package com.licia.cursojava.aula15abril.array.unit;

import java.util.Scanner;

public class Exerc�cio8_NumerosInteiros {

	public static void main(String[] args) {
		/*Considere um array carregado com 10 n�meros inteiros positivos.

		�Informar se tem mais n�meros pares, mais n�meros impares ou iguais
		 */
		
		Scanner scan  =  new Scanner (System.in);
		
		int [] numerosInteiros = new int [6];
		int contadorPar=0, contadorImpar=0, contadorPositivo=0, contadorNegativo=0;
		
		
		for (int i = 0; i < numerosInteiros.length; i++) {
			System.out.printf("Digite o %d� n�mero", i+1);
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
			System.out.printf("No conjunto de n�meros informados temos mais n�meros pares, na quantidade de %d\n:", contadorPar);
		}
		else if (contadorPar<contadorImpar){
			System.out.printf("No conjunto de n�meros informados temos mais n�meros �mpares, na quantidade de %d\n:", contadorImpar);
		}
		else {
			System.out.printf("No conjunto de n�meros informados temos n�meros �mpares e pares iguais\n");
				
		}
			
		
		if(contadorPositivo>contadorNegativo) {
			System.out.printf("No conjunto de n�meros informados temos mais n�meros positivos, na quantidade de %d:", contadorPositivo);		
		}
		else if(contadorPositivo<contadorNegativo) {
			System.out.printf("No conjunto de n�meros informados temos mais n�meros negativos, na quantidade de %d:", contadorNegativo);		
		}
		else {
			System.out.printf("No conjunto de n�meros informados temos n�meros iguais de positivos e negativos");
		}
		scan.close();
	}

}
