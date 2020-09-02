package com.licia.cursojava.listaexercicio3unit;

import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int idade, contador = 0, maiorIdade = 0;
		
		while(contador<7) {
			System.out.printf("Digite a idade da %d° pessoa",contador+1);
			idade = scan.nextInt();
			
			if(idade>=18 && idade<=130) {
				maiorIdade++;
			}
		
			if(idade>130 || idade<0) {
				System.out.println("Digite uma idade válida. Idade entre zero e 130 anos.");
				continue;
			}	
			contador++;
			
		}
		
		System.out.printf("O número de pessoas maiores de idade é %d : ", maiorIdade);
		scan.close();
	}

}
