package com.licia.cursojava.listaexercicio3unit;

import java.util.Scanner;

public class Exerc�cio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int idade, contador = 0, maiorIdade = 0, maisIdosa=0;
		
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
			
			if(idade > maisIdosa) {
				maisIdosa = idade;
			}		
			contador++;
			
		}
		
		System.out.printf("O n�mero de pessoas maiores de idade s�o %d. \n", maiorIdade);
		System.out.printf("A idade da pessoa mais idosa � %d anos. ", maisIdosa);
		scan.close();
	}

}


