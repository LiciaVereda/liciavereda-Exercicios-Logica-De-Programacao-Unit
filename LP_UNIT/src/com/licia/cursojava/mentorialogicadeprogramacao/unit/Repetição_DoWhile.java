package com.licia.cursojava.mentorialogicadeprogramacao.unit;

import java.util.Scanner;

public class Repeti��o_DoWhile {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		
		int numeroTabuada, resultadoTabuada, contador = 0;
		
		System.out.print("Voc� deseja ver a tabuada de que n�mero?");
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
