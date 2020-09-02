package com.licia.cursojava.aula15abril.array.unit;

import java.util.Scanner;

public class Exercício9_Passageiros {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [] hour = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};
		int [] passageiro = {3000,350,500,450,700,1000,2000,1500,1000,1300,1200,1500,1500,1300,1300,1500,1300,1800,1700,1600,1500,1200,1000,500};
		int acumuladorPassageiroParte1=0, acumuladorPassageiroParte2=0, posicaoPico1 = 0,posicaoPico2=0, maiorPassageiro1=0, maiorPassageiro2=0, passageiroAntesPico1=0;
		int passageiroAntesPico2=0;
		float mediaParte1, mediaParte2, percentualParte1, percentualParte2;
		final int qtdeMedia= 12;
		
		for (int i = 0; i < passageiro.length-12; i++) {
			acumuladorPassageiroParte1+=passageiro[i];
			
		}
		
		for (int i = 12; i < passageiro.length; i++) {
			acumuladorPassageiroParte2+=passageiro[i];
			
		}
		
		mediaParte1 = acumuladorPassageiroParte1 / qtdeMedia;
		mediaParte2 = acumuladorPassageiroParte2 / qtdeMedia;
		
		
		for (int i = 0; i <passageiro.length-12; i++) {
			if (passageiro[i]>maiorPassageiro1) {
				maiorPassageiro1=passageiro[i];
				posicaoPico1=i;
			}
		 }
			
		if (posicaoPico1==0) {
			passageiroAntesPico1 = maiorPassageiro1 / 2;
				
		}
		else{
			passageiroAntesPico1=passageiro[posicaoPico1-1];
				
		}
			
			/*for (int i = 0; i < passageiro.length-12; i++) {
				if (i+1==posicaoPico1-1) {
					passageiroAntesPico1=passageiro[i];
					
				}
				else if(posicaoPico1==i+1) {
					passageiroAntesPico1 = maiorPassageiro1 / 2;
				}
				
			}*/
			
			
		for (int i = 12; i <passageiro.length; i++) {
			if (passageiro[i]>maiorPassageiro2) {
				maiorPassageiro2=passageiro[i];
				posicaoPico2=i;
			}
		}
		
		passageiroAntesPico2 = passageiro[posicaoPico2-1];
				
		percentualParte1 = (((float)passageiroAntesPico1/ mediaParte1)-1)*100;
		percentualParte2 = (((float) passageiroAntesPico2/ mediaParte2)-1)*100;
			
				
			
		System.out.printf("A média de passageiros registrado na primeira parte foi %.2f \n",mediaParte1);
		System.out.printf("A média de passageiros registrado na segunda parte foi %.2f\n",mediaParte2);
		System.out.printf("O pico de passageiros nas primeiras doze horas %d\n",hour[posicaoPico1]);
		System.out.printf("O pico de passagieros nas últimas doze horas %d\n",hour[posicaoPico2]);
		System.out.println("\nDESAFIO:");
		System.out.printf("O percentual de passageiros da hora anterior ao pico da  parte 1: %.2f\n",percentualParte1);
		System.out.printf("O percentual de passageiros da hora anterior ao pico da  parte 2: %.2f ",percentualParte2);
		
		scan.close();
		
		/*System.out.println("passageiros antes pico1"+passageiroAntesPico1);
		System.out.println("passageiros antes pico2"+passageiroAntesPico1);
		
		System.out.println("maior passageiro"+maiorPassageiro1);
		System.out.println("maior passageiro"+maiorPassageiro2);
		*/
	}

	}
