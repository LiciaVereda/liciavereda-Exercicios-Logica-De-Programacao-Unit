package com.licia.cursojava.listaexercicio4.unit;

import java.util.Scanner;

public class Questão1_MaiorTemperatura {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float [] temperatura = new float[3];
		float maiorTemperatura=0;
		int contador=0;
		
		while(contador<3) {
			System.out.printf("Digite a %dº temperatura: ", contador+1);
			temperatura[contador] = scan.nextFloat();	
			if(temperatura[contador]<0) {
				System.out.println("Digite uma temperatura positiva");
				continue;
			}
			contador++;
		}
		
		for (int i = 0; i < temperatura.length; i++) {
			if(temperatura[i]> maiorTemperatura) {
				maiorTemperatura=temperatura[i];
			}
		}
		
		System.out.printf("A maior temperatura registrada foi de %.2f.", maiorTemperatura);
		scan.close();
				
}
		
}


