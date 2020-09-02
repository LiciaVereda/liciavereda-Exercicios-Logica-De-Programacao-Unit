package com.licia.cursojava.aula13maio.array.unit;

public class Lista7_Intermedi�rio {

	public static void main(String[] args) {
		int [] numeros = {50, -450, 1, 1587, -8, 755, -3588, 87, -33, 9};
		
		int operacaoSubtracao;

		int qtdeNumeroPositivo = 0, qtdeNumeroNegativo = 0;
		double percPositivo, percNegativo;
		int maior = -9999; 
		
		
		System.out.println("A diferen�a entre os elementos �: (O primeiro menos o segundo, o segundo menos o terceiro...)");
		
		for (int i = 0; i < numeros.length; i++) {
			if (i < numeros.length - 1) {
			
				operacaoSubtracao = numeros[i] - numeros[i+1];
			
				System.out.println( "A diferen�a entre os elementos(1� - 2� / 2� -3�...): " + operacaoSubtracao );
			}
		}
		System.out.println("");
		
		System.out.print("N�meros positivo:");
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] >= 0) {
			
				System.out.print(" " + numeros[i]);
				qtdeNumeroPositivo++;
			}
		}
		System.out.println();
		System.out.print("N�meros negativos:");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < 0) {
				
				System.out.print( " " + numeros[i] );
				qtdeNumeroNegativo++;
			}
		}
		
		System.out.println();
		percPositivo = (float) qtdeNumeroPositivo/ (qtdeNumeroPositivo + qtdeNumeroNegativo) * 100;
		percNegativo = (float) qtdeNumeroNegativo/(qtdeNumeroPositivo+qtdeNumeroNegativo) * 100;
		
		System.out.printf("\nO percentual de n�meros negativos �: %.2f\n", percPositivo);
		System.out.printf("O percentual de n�meros positivos �: %.2f", percNegativo);
		
		
		System.out.println();
		
		for (int i = 0; i < numeros.length; i++) {
			
			if (numeros[i] <= -10 && numeros[i] >= -99 || numeros[i] >= 10 && numeros[i] <= 99) {
				System.out.println("N�meros na ordem de dezena: " + numeros[i] );
			}
		}
		System.out.println();
			
		for (int i = 0; i < numeros.length; i++) {
			
			if(numeros[i]<0) {
				if ((numeros[i] * (-1)) > maior) {
					
					maior = numeros[i]*(-1);
				}
				else {
					if(numeros[i]>maior) {
					
						maior = numeros[i];		
					}
				}
				
			}
		}
		
		System.out.println("O maior n�mero absoluto �: " + maior);		
	}

}


