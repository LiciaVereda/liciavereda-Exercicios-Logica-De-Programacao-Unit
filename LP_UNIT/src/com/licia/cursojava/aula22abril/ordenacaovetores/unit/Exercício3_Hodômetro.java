package com.licia.cursojava.aula22abril.ordenacaovetores.unit;

import java.util.Scanner;

/*  A quantidade de quilômetros percorrida em cada dia da semana. 
2.  A média de quilômetros percorridos 
3.  Os dias da semana em que foi percorrido quilômetros acima da média 
4.  Desafio opcional: Mostrar o dia da semana (por extenso) nos itens 1 e 3 
 * */

public class Exercício3_Hodômetro {

	public static void main(String[] args) {
		Scanner scan =  new Scanner (System.in);
		
		int [] marcacaoHodometro =  {89400, 89800, 99100, 99500, 900, 1500, 2100, 2200};
		int [] qtdePercorridaDiaria = new int [7];
		
		float mediaKmPercorridos;
		
	
		
		for (int i = 0; i <= marcacaoHodometro.length; i++) {
			if(i!=0) {
				qtdePercorridaDiaria[i] = ( marcacaoHodometro[i] - marcacaoHodometro[i-1] );
				
			}
			else {
				qtdePercorridaDiaria [i] = marcacaoHodometro[i];
			}
		
			
			
			
		}
		for (int i = 0; i <= qtdePercorridaDiaria.length; i++) {
			System.out.println(qtdePercorridaDiaria[i]);
			
		}
		
		

	}

}
