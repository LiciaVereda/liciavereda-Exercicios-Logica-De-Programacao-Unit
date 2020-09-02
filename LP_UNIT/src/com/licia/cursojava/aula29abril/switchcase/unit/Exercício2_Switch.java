package com.licia.cursojava.aula29abril.switchcase.unit;

import java.util.Scanner;

public class Exercício2_Switch {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		int diaDaSemana=0;
		
		
		do {
			try {
				
				System.out.print("Digite um número correspondente a um dia da semana:");
				diaDaSemana = scan.nextInt();
				}
				
				catch (Exception e) {
					System.out.println("Digite um número");
					scan.next();
					continue;
				}
				if(diaDaSemana>7 || diaDaSemana<1) {
		        	System.out.println("DIA INVÁLIDO. Digite valores entre 1 e 7");
		        	continue;	        
		        }		
		} while(diaDaSemana>12 || diaDaSemana<1) ;
		
		
		
		
		switch( diaDaSemana ) {
        
            case 1:    	       
            case 2:         	               
            case 3:         	                
            case 4:         	  
            case 5:
            	System.out.println("O dia da semana digitado é um dia ÚTIL");
                break;  
            case 6:
            case 7:
            	System.out.println("O dia da semana digitado é um FINAL de SEMANA");
                break;    
        }
        scan.close();
	}

}
