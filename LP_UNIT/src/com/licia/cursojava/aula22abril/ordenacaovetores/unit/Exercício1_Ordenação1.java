package com.licia.cursojava.aula22abril.ordenacaovetores.unit;

import java.util.Scanner;

public class Exercício1_Ordenação1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int menorValor;
		int[] array = {17, 32, 5, 87, 2, 48, 36, 85, 10, 63};
		
		for (int i = 0; i < array.length-1; i++) {
			menorValor = i;

			for (int j = i+1 ; j < array.length; j++) {
				
				if (array[j] < array[menorValor]) {
					menorValor = j;					
				}
			}
			int temp = array[i];
			array[i] = array[menorValor];
			array[menorValor] = temp;
		}
		
		System.out.println("Os arrays em ordem crescente é:");
		for (int i = 0; i < array.length; i++) {
			
			System.out.printf("\n[%d] = %d", i, array[i]);
			
		}
		
		int maiorValor;
		for (int i = 0; i < array.length-1; i++) {
			maiorValor = i;

			for (int j = i+1 ; j < array.length; j++) {
				
				if (array[j] > array[maiorValor]) {
					maiorValor = j;					
				}
			}
			int temp = array[i];
			array[i] = array[maiorValor];
			array[maiorValor] = temp;
		}
		
		System.out.println("\nOs arrays em ordem decrescente é:");
		for (int i = 0; i < array.length; i++) {
			
			System.out.printf("\n[%d] = %d", i, array[i]);
			
		}
		
		System.out.println("\n");
		System.out.printf("O menor valor é %d:\n", array[9]);
		System.out.printf("O maior valor é %d:", array[0]);
		
		

	}

}
