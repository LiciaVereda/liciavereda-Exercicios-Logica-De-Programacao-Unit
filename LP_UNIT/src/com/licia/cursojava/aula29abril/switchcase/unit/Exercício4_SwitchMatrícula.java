package com.licia.cursojava.aula29abril.switchcase.unit;

import java.util.Scanner;

public class Exerc�cio4_SwitchMatr�cula {

	public static void main(String[] args) {
		Scanner scan = new  Scanner(System.in);
		
		String inicioMatricula ;
		
		System.out.print("Digite o in�cio da matr�cula do aluno");
		inicioMatricula = scan.next();
		
		
		switch(inicioMatricula) {
        
        case "1":   
        	System.out.println("O aluno participa do curso T�CNICO");
            break; 
        case "2":         	               
        case "3":         	                
        case "4": 
        	System.out.println("O aluno participa do curso de GRADUA��O");
            break; 
        case "5":
        case "6":
        	System.out.println("O aluno participa do curso de LATO SENSU");
            break;  
    
        case "7":
        case "8":
        	System.out.println("O aluno participa do curso de STRICTO SENSU");
            break;    
        default:
        	System.out.println("MATR�CULA INCORRETA");
    }
    scan.close();
}

}


