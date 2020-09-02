package com.licia.cursojava.listaexercicio3unit;

import java.util.Scanner;

public class Exercício5 {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		
		int idade, contador = 0, acumulador =0 , maiorIdade = 0 ,maisIdosa = 0, maisNova = 999, contadorDezoito=0;
		float media;
		final int denominadorMedia = 7;
		
		
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
			
			if(idade==18) {
				contadorDezoito++;
			}
			
			if(idade > maisIdosa) {
				maisIdosa = idade;
				
			}
			
			if(idade<maisNova) {
				maisNova = idade;
			}
			contador++;
			acumulador+=idade;
		}
		
		
		media = (float) (acumulador) / denominadorMedia;
		
		
		System.out.printf("O número de pessoas maiores de idade são: %d. \n", maiorIdade);
		System.out.printf("A idade da pessoa mais idosa é %d anos.\n", maisIdosa);
		System.out.printf("A idade da pessoa mais jovem é %d anos.\n", maisNova);
		System.out.printf("A média das idades é %.2f.\n",media);
		System.out.printf("O número de pessoas que têm dezoito anos é: %d.", contadorDezoito);
		scan.close();


	}

}


