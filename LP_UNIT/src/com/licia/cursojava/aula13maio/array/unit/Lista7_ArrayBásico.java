package com.licia.cursojava.aula13maio.array.unit;

public class Lista7_ArrayBásico {

	public static void main(String[] args) {
		int [] numeros = {150, 18, 540, 320, 7, 1350, 25, 2777, 3, 87};
		
		
		for (int i = 0; i < numeros.length; i++) {
			
			if (numeros[i] % 2 != 0) {
				System.out.println("O número é ímpar:"  + numeros[i]);
			}
		}
		
		System.out.println();
		
		
		for (int i = 0; i < numeros.length; i++) {
			
			if (i % 2 == 0) {
				System.out.println("Número na posição par:" + numeros[i] );
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < numeros.length; i++) {
			
			if (numeros[i] < 500 ) {
				System.out.println("Número menor que 500: " + numeros[i]);
			}
		}
		
		System.out.println();
		
	
		
		for (int i = 0; i < numeros.length; i++) {
			
			if (numeros[i] >= 100 && numeros[i] <= 999) {
				System.out.println("Número da ordem de centena: " + numeros[i] );
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < numeros.length; i++) {
			
			if ((numeros[i] >= 10 && numeros[i] <= 99) || (numeros[i] >= 1000 && numeros[i] <= 9999)) {
				System.out.println("Números na ordem de dezena ou milhar:" + numeros[i]);
			}
		}
		System.out.println();
		
		
		for (int i = 0; i < numeros.length; i++) {
			
			if (i <= (numeros.length - 1)/2) {
				System.out.println("Este número está na primeira metade do array:" + numeros[i]);
			}
		}
		System.out.println();
		
		System.out.println("A segunda metade do array são os números: ");	
		for (int i = 0; i < numeros.length; i++) {
			
			if (i > (numeros.length - 1)/2) {
				System.out.println("Este número está na segunda metade do array " + numeros[i] + " ");
			}
		}
		System.out.println();
		
		System.out.print("Array na ordem inversa:");
		
		for (int i = numeros.length - 1; i >= 0; i--) {
				System.out.print(" " + numeros[i] + " ");
		}
		
	}
}


