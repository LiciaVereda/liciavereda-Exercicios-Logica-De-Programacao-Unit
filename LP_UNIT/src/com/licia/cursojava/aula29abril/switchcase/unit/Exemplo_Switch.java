package com.licia.cursojava.aula29abril.switchcase.unit;

import java.util.Scanner;

public class Exemplo_Switch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
        int diaDaSemana;
        boolean erro = true;
        String nomeDia;
        
       /* System.out.print("Digite um n�mero de 1 a 7: ");
        diaDaSemana = scan.nextInt();*/
        while(true) {
        try {
        	System.out.print("Digite um n�mero de 1 a 7: ");
            diaDaSemana = scan.nextInt();
           /* if(diaDaSemana>7 && diaDaSemana<1) {
            	System.out.println("Digite valores entre 1 e 7");
             }*/
            }
        catch(Exception exception){
        	
        	System.out.println("Digite valores entre 1 e 7");
        	scan.next();
        	continue;
        }
        break;
        	
        }
        
        
       /* while(erro) {
        
        	System.out.print("Digite um n�mero de 1 a 7: ");
            diaDaSemana = scan.nextInt();
            
        	if(diaDaSemana>7 && diaDaSemana<1) {
        	System.out.println("Digite valores entre 1 e 7");
        	
        	erro = true;
        	continue;
        	
        	}
       }*/
     
     
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
            default:
                System.out.printf("Dia inv�lido."); 
                
        }
        scan.close();

	}

}
