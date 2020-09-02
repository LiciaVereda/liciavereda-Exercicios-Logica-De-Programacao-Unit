package com.licia.cursojava.avaliacaoIIunidade.unit;
/*Dado o array int dados = {10, 4, 25, 11, 15, 7, 5, 12, 13, 4}; 
 * contendo o dia e o mês de nascimento de 5 pessoas (a primeira pessoa nasceu em 10/04, 
 * a segunda pessoa nasceu em 25/11 e assim sucessivamente). Escreva um programa para
 *  mostrar: (1) A data das pessoas do signo de touro e sagitário;
 *   (2) quantas pessoas são do 
 * signo de touro; (3) Quantas pessoas nasceram em dias pares; (4) O signo de cada pessoa.
 */

public class Signo {

	public static void main(String[] args) {
		int [] dados = {10, 4, 25, 11, 15, 7, 5, 12, 13, 4};
		int [] diaTouro = new int [10];
		int [] mesTouro = new int [10];
		int [] diaSargitario = new int [10];
		int [] mesSargitario = new int [10];
		int contSargitario=0, contTouro =0, nascidosDiasPares = 0;
		
		for (int i = 0; i < dados.length; i++) {
			
			if (i % 2 == 0 && (dados[i+1] == 4 || dados[i+1] == 5)) {
				diaTouro[i] = dados[i];
				mesTouro[i] = dados[i+1];
				contTouro++;
				
				
			}
			else if(i % 2 == 0 && (dados[i+1] == 11 || dados[i+1] == 12)) {
				diaSargitario[i] = dados[i];
				mesSargitario[i] = dados[i+1];
				contSargitario++;
				
			}
			
		}
		for (int i = 0; i < dados.length; i++) {
			if(i % 2 ==0 && dados[i] % 2 ==0) {
				nascidosDiasPares++;
			}
			
		}
		
		for (int i = 0; i < diaSargitario.length; i++) {
			if(diaSargitario[i]!=0) {
				System.out.println(diaSargitario[i] +" " + mesSargitario[i]);
				
				
			}
		}
			
		for (int i = 0; i < diaTouro.length; i++) {
			if(diaTouro[i]!=0) {
				System.out.println(diaTouro[i] +" " + mesTouro[i]);		
					
			}	
		}
		
		System.out.println("O número de pessoas do signo de touro são:" +contTouro);
		System.out.println("O núemro de pessoas nascidas em dias pares são:" +nascidosDiasPares);
		
	
			
		}
		

	}
		


