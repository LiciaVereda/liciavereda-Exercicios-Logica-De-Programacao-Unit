package com.licia.cursojava.mentorialogicadeprogramacao.unit;

import java.util.Scanner;

public class Repetição_DoWhile {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		
		int numeroTabuada, resultadoTabuada, contador = 0;
		
		System.out.print("Você deseja ver a tabuada de que número?");
		numeroTabuada = scan.nextInt();
		
		do {
			
			resultadoTabuada = numeroTabuada * contador;
			System.out.printf("%d * %d = %d \n",numeroTabuada, contador, resultadoTabuada);
			contador++;
			
		}
		while(contador<=10);
		scan.close();

	}

}
