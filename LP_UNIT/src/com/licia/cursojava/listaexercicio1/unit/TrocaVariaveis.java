package com.licia.cursojava.listaexercicio1.unit;

import java.util.Scanner;

public class TrocaVariaveis {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		
		int primeiroNumero, segundoNumero, posicaoTroca;
		
		System.out.println("Digite o primeiro n�mero: ");
		primeiroNumero = scan.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		segundoNumero = scan.nextInt();
		
		if(primeiroNumero>segundoNumero) {
			posicaoTroca = primeiroNumero;
			primeiroNumero=segundoNumero;
			segundoNumero= posicaoTroca;
					
		}
		System.out.println("O primeiro n�mero �: " +primeiroNumero + " " + "O segundo n�mero �: " +segundoNumero);
		scan.close();
		

	}

}
