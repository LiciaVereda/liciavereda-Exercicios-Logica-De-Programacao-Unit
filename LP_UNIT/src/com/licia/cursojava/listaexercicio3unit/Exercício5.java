package com.licia.cursojava.listaexercicio3unit;

import java.util.Scanner;

public class Exerc�cio5 {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		
		int idade, contador = 0, acumulador =0 , maiorIdade = 0 ,maisIdosa = 0, maisNova = 999, contadorDezoito=0;
		float media;
		final int denominadorMedia = 7;
		
		
		while(contador<7) {
			System.out.printf("Digite a idade da %d� pessoa",contador+1);
			idade = scan.nextInt();
			
			if(idade>130 || idade<0) {
				System.out.println("Digite uma idade v�lida. Idade entre zero e 130 anos.");
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
		
		
		System.out.printf("O n�mero de pessoas maiores de idade s�o: %d. \n", maiorIdade);
		System.out.printf("A idade da pessoa mais idosa � %d anos.\n", maisIdosa);
		System.out.printf("A idade da pessoa mais jovem � %d anos.\n", maisNova);
		System.out.printf("A m�dia das idades � %.2f.\n",media);
		System.out.printf("O n�mero de pessoas que t�m dezoito anos �: %d.", contadorDezoito);
		scan.close();


	}

}


