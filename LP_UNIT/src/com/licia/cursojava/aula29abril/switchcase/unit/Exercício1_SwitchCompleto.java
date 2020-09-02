package com.licia.cursojava.aula29abril.switchcase.unit;

import java.util.Scanner;

public class Exerc�cio1_SwitchCompleto {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
        int diaDaSemana=0;
        
        do {
			try {
				
				System.out.print("Digite um n�mero correspondente a um dia da semana:");
				diaDaSemana = scan.nextInt();
				}
				
				catch (Exception e) {
					System.out.println("Digite um n�mero");
					scan.next();
					continue;
				}
				if(diaDaSemana>7 || diaDaSemana<1) {
		        	System.out.println("DIA INV�LIDO. Digite valores entre 1 e 7");
		        	continue;	        
		        }		
		} while(diaDaSemana>12 || diaDaSemana<1) ;
		
        
        
        switch( diaDaSemana )
        {
            case 1:
            	System.out.println("O dia da semana correspondente ao n�mero digitado foi: DOMINGO");
            	break;        
            case 2:
            	System.out.println("O dia da semana correspondente ao n�mero digitado foi: SEGUNDA");
                break;               
            case 3:
            	System.out.println("O dia da semana correspondente ao n�mero digitado foi: TER�A");
                break;                
            case 4:
            	System.out.println("O dia da semana correspondente ao n�mero digitado foi: QUARTA");
                break;  
            case 5:
            	System.out.println("O dia da semana correspondente ao n�mero digitado foi: QUINTA");
                break;  
            case 6:
            	System.out.println("O dia da semana correspondente ao n�mero digitado foi: SEXTA");
                break;
            case 7:
            	System.out.println("O dia da semana correspondente ao n�mero digitado foi: S�BADO");
                break;     
        }
        scan.close();

	}

}

