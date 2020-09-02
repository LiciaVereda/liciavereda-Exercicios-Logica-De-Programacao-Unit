package com.licia.cursojava.listaexercicio4.unit;

import java.util.Scanner;

public class Questão2_MenorTemperatura {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		
		float[] temperatura = {26f, 28.5f, 23.5f, 27f, 23.5f, 25f, 26.5f};
		float menorTemperatura=999;
		
		for (int i = 0; i < temperatura.length; i++) {
			if(temperatura[i]<menorTemperatura) {
				menorTemperatura = temperatura[i];	
			}		
		}
		System.out.printf("A menor temperatura registrada foi de %.2f:", menorTemperatura);
		scan.close();
	}

}
