package com.licia.cursojava.listaexercicio1.unit;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um n�mero: ");
		numero = scan.nextInt();
			
		if(numero % 2 == 0) {
			System.out.println("N�mero digitado � par");
		}
		else {
			System.out.println("N�mero digitado � �mpar");
		}
		scan.close();

	}

}
