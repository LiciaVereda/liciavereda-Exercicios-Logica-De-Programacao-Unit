package com.licia.cursojava.listaexercicio4.unit;

import java.util.Scanner;

public class Questão3_TempPositivasENegativas {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		//float[] temperatura = {2f, 1f, 3f, 2f, 1f, 4f, 3f}; 
		//float[] temperatura = {-2f, -1f, -4f, -2f, -1f, -3f, -5}; 
		 float[] temperatura = {2f, -1f, 0f, -2f, 1f, 3f, -1f}; 
		float maiorTemperatura =-999;
		
		for (int i = 0; i < temperatura.length; i++) {
			if (temperatura[i]>maiorTemperatura) {
				maiorTemperatura = temperatura[i];		
			}		
		}
		System.out.printf("%.2f", maiorTemperatura);
		scan.close();

	}
}
