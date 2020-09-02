package com.licia.cursojava.listaexercicio4.unit;

import java.util.Scanner;

public class Questão4_TempMaiorMenor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		 //float[] temperatura = {2f, -1f, 0f, -2f, 1f, 3f, -1f}; 
		 //float[] temperatura = {2f, 1f, 3f, 2f, 0f, 4f, 3f};
		 float[] temperatura = {2f, -1f, 0f, -2f, 1f, 3f, -1f};
		 float maiorTemperatura=-999, menorTemperatura=999;
		 
		 
		 for (int i =0; i< temperatura.length; i++) {
			 if(temperatura[i]>maiorTemperatura) {//orTemperatura > menorTemperatura) {
				 maiorTemperatura = temperatura[i];
			 }			
		 }
		 
		 for (int i =0; i< temperatura.length; i++) {
			 if(temperatura[i]<menorTemperatura && temperatura[i]<maiorTemperatura) {//orTemperatura > menorTemperatura) {
				 menorTemperatura = temperatura[i];
			 }			
		 } 
		 
		 System.out.printf("A maior temperatura registrada foi %.2f\n", maiorTemperatura);
		 System.out.printf("A menor temperatura registrada foi de %.2f", menorTemperatura);
		 scan.close();

	}

}
