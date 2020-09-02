package com.licia.cursojava.listaexercicio3unit;

import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int idade, contador = 0, maiorIdade = 0, maisIdosa=0, maisNova=999;
		
		while(contador<7) {
			System.out.printf("Digite a idade da %d° pessoa",contador+1);
			idade = scan.nextInt();
			
			if(idade>130 || idade<0) {
				System.out.println("Digite uma idade válida. Idade entre zero e 130 anos.");
				continue;
			}	
			
			if(idade>=18 && idade<=130) {
				maiorIdade++;	
			}
			
			if(idade > maisIdosa) {
				maisIdosa = idade;
			}
			
			if(idade<maisNova) {
				maisNova = idade;
			}
			contador++;
		}
		
		System.out.printf("O número de pessoas maiores de idade são %d.\n", maiorIdade);
		System.out.printf("A idade da pessoa mais idosa é %d anos.\n", maisIdosa);
		System.out.printf("A idade da pessoa mais jovem é %d anos. ", maisNova);
		scan.close();
	

	}

}
