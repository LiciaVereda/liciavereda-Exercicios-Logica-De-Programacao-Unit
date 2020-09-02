package com.licia.cursojava.avaliacaoIIunidade.unit;

import java.util.Scanner;

public class Questao2_ModeloB {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int [] array = new int [5];
		int posicoesDisponiveis=0;
		boolean arrayCheio= false, elementoDuplicado = false;
		int elementoArray;
		
		
		
		do {
			
				for (int i = 0; i < array.length; i++) {
					if(array [i] == 0) {
						posicoesDisponiveis = posicoesDisponiveis +1;
					}
					
				}
				if((posicoesDisponiveis == 0)) {
					System.out.println(" ARRAY CHEIO \n");
					arrayCheio = true;
					break;
				}
				
				if(arrayCheio == false || posicoesDisponiveis > 0)  {
					System.out.println("Digite um elemento para o array");
					elementoArray = scan.nextInt();
					
					for (int i = 0; i < array.length; i++) {
						if(array[i] == elementoArray) {
							System.out.println("Não é permitido duplicidade de elementos.");
							elementoDuplicado = true;
							break;
						}
					}	
					for (int i = 0; i < array.length; i++) {
						if (array[i] == 0 && elementoDuplicado == false && elementoArray % 2 == 0 ){
							array[i] = elementoArray;		
						}
						else if (elementoArray % 2 != 0){
							System.out.println("Não é permitido elementos ímpares.\n");
							break;
							
							
						}			
					}
					
						
					}				
		
		} while(posicoesDisponiveis > 0);
			
			scan.close();


	}

}
