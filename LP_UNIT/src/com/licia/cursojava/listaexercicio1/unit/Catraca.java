package com.licia.cursojava.listaexercicio1.unit;

import java.util.Scanner;

public class Catraca {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int valorInicialCatraca, valorFinalCatraca, totalPassageiros;
		float valorApurado;
		final float passagem = 4.50f;
		final int limiteCatraca = 999;
		
		System.out.println("Digite a posi��o inicial da catraca: ");
		valorInicialCatraca = scan.nextInt();
		System.out.println("Digite a posi��o final da catraca: ");
		valorFinalCatraca = scan.nextInt();
		
		if(valorFinalCatraca>valorInicialCatraca) {
			totalPassageiros = valorFinalCatraca - valorInicialCatraca;
			valorApurado = passagem * totalPassageiros;
			
		}else {
			totalPassageiros = limiteCatraca- valorInicialCatraca + valorFinalCatraca;
			valorApurado = passagem * totalPassageiros;
		}
		
		System.out.print("O n�mero de passageiros �: " +totalPassageiros + "\n");
		System.out.print("O valor total apurado �: ");
		System.out.println(String.format("%.2f", valorApurado));
		
		scan.close();
		
		
		

	}

}
