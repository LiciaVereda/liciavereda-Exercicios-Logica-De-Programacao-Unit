package com.licia.cursojava.aula29abril.switchcase.unit;

import java.util.Scanner;

public class Exercício4_SwitchMatrícula {

	public static void main(String[] args) {
		Scanner scan = new  Scanner(System.in);
		
		String inicioMatricula ;
		
		System.out.print("Digite o início da matrícula do aluno");
		inicioMatricula = scan.next();
		
		
		switch(inicioMatricula) {
        
        case "1":   
        	System.out.println("O aluno participa do curso TÉCNICO");
            break; 
        case "2":         	               
        case "3":         	                
        case "4": 
        	System.out.println("O aluno participa do curso de GRADUAÇÃO");
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
        	System.out.println("MATRÍCULA INCORRETA");
    }
    scan.close();
}

}


