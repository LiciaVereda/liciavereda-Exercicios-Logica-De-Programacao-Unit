package com.licia.cursojava.mentorialogicadeprogramacao.unit;

import java.util.Scanner;

public class Acumulador {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float valorProduto, acumulador =0;

		for(int i=1; i<=5; i++){
			System.out.printf("Digite o valor do %dº produto ", i);
			valorProduto = scan.nextFloat();
			acumulador = acumulador + valorProduto;
		}
		System.out.print("Valor do acumulador é: " + acumulador);
		scan.close();
	}
}
