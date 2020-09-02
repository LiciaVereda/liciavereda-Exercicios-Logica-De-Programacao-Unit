package com.licia.cursojava.listaexercicio1.unit;

import java.util.Scanner;

public class TrocaVariaveis {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		
		int primeiroNumero, segundoNumero, posicaoTroca;
		
		System.out.println("Digite o primeiro número: ");
		primeiroNumero = scan.nextInt();
		System.out.println("Digite o segundo número: ");
		segundoNumero = scan.nextInt();
		
		if(primeiroNumero>segundoNumero) {
			posicaoTroca = primeiroNumero;
			primeiroNumero=segundoNumero;
			segundoNumero= posicaoTroca;
					
		}
		System.out.println("O primeiro número é: " +primeiroNumero + " " + "O segundo número é: " +segundoNumero);
		scan.close();
		

	}

}
