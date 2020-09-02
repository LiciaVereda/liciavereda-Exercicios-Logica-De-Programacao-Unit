package com.licia.cursojava.listaexercicio4.unit;

import java.util.Scanner;

public class Questão5_TemperaturaMédia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//float [] temperatura = new float [7];
		float[] temperatura = {26f, 28.5f, 23f, 27.5f, 23f, 24f, 26.5f}; 
		
		float media, totalTemperatura=0;
		String acumulador = "";
		final float qtdeTemperaturas = 7;
		int contador=0;
		
		
		for(int i=0; i<temperatura.length; i++) {
			totalTemperatura+=temperatura[i];		
		}
		
		media =  totalTemperatura / qtdeTemperaturas;
		
		for (int i = 0; i < temperatura.length; i++) {
			if(temperatura[i]> media) {
				acumulador+= " " +  temperatura[i];
				contador++;
			}		
			
		}
		
		System.out.printf("A média das temperaturas registradas foi de %.2f\n", media);
		System.out.printf("As temperaturas registradas acima da média foram %s\n",acumulador);
		System.out.printf("Quantidade de temperaturas acima da média foi de %d:",contador);
		scan.close();
		

	}

}
