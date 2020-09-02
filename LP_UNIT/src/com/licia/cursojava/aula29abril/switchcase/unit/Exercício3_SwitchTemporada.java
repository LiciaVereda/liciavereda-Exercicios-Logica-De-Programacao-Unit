package com.licia.cursojava.aula29abril.switchcase.unit;

import java.util.Scanner;

public class Exerc�cio3_SwitchTemporada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int mesDoAno=0;
		
		
		do {
			try {
				
				System.out.print("Digite um n�mero correspondente a um m�s do ano:");
				mesDoAno = scan.nextInt();
				}
				
				catch (Exception e) {
					System.out.println(" M�S INV�LIDO. Digite um n�mero");
					scan.next();
					continue;
				}
				if(mesDoAno>12 || mesDoAno<1) {
		        	System.out.println("M�S INV�LIDO. Digite valores entre 1 e 12");
		        	continue;	        
		        }		
		} while(mesDoAno>12 || mesDoAno<1) ;
		
	
		
		switch(mesDoAno) {
        
	        case 1:    	       
	        case 2:         	                               	                
	        case 6:         	  
	        case 7:
	        case 12:     	
	        	System.out.println("M�s de ALTA TEMPORADA");
	            break;  
	       
	        case 3:
	        case 4:
	        case 5:
	        case 8:
	        case 9:
	        case 10:
	        case 11:
	        	System.out.println("M�s de BAIXA TEMPORADA");
	            break;
	       
    }
		scan.close();

	}

}

